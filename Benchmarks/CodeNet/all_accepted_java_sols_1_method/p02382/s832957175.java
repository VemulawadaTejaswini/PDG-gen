import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] vect1 = new int[n];
		int[] vect2 = new int[n];
		double keisan = 0.0;
		double inf = Double.POSITIVE_INFINITY;
		for(int i=0;i<n; i++){
			vect1[i] = scan.nextInt();
//				System.out.println(vect1[i]);
		}
		for(int i=0;i<n; i++){
			vect2[i] = scan.nextInt();
		}

		for(int i=0;i<n; i++){
			double zet = 0;
			zet = vect1[i] - vect2[i];
			zet = Math.abs(zet);
			zet = Math.pow(zet,1);
			keisan += zet;
		}
		keisan = Math.pow(keisan, (1.0/1.0));
		System.out.println(keisan);
		keisan = 0.0;

		for(int i=0;i<n; i++){
			double zet = 0;
			zet = vect1[i] - vect2[i];
			zet = Math.abs(zet);
			zet = Math.pow(zet,2);
			keisan += zet;
		}
		keisan = Math.pow(keisan, (1.0/2.0));
		System.out.println(keisan);
		keisan = 0.0;

		for(int i=0;i<n; i++){
			double zet = 0;
			zet = vect1[i] - vect2[i];
			zet = Math.abs(zet);
			zet = Math.pow(zet,3);
			keisan += zet;
		}
		keisan = Math.pow(keisan, (1.0/3.0));
		System.out.println(keisan);
		keisan = 0.0;

		for(int i=0;i<n; i++){
			double zet = 0;
			zet = vect1[i] - vect2[i];
			zet = Math.abs(zet);
			if(zet>keisan){
				keisan = zet;
			}
			
		}
		//keisan = Math.pow(keisan, (1.0/inf));
		System.out.println(keisan);
		keisan = 0.0;
	}
}