import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] vect1 = new int[n];
		int[] vect2 = new int[n];
		double temp = 0.0;
		for(int i=0;i<n; i++){
			vect1[i] = scan.nextInt();
		}
		for(int i=0;i<n; i++){
			vect2[i] = scan.nextInt();
		}

		for(int i=0;i<n; i++){		//?????????
			double abs = 0;
			abs = vect1[i] - vect2[i];
			abs = Math.abs(abs);
			abs = Math.pow(abs,1);
			temp += abs;
		}
		temp = Math.pow(temp, (1.0/1.0));
		System.out.println(temp);
		temp = 0.0;

		for(int i=0;i<n; i++){		//?????????
			double abs = 0;
			abs = vect1[i] - vect2[i];
			abs = Math.abs(abs);
			abs = Math.pow(abs,2);
			temp += abs;
		}
		temp = Math.pow(temp, (1.0/2.0));
		System.out.println(temp);
		temp = 0.0;

		for(int i=0;i<n; i++){		//?????????
			double abs = 0;
			abs = vect1[i] - vect2[i];
			abs = Math.abs(abs);
			abs = Math.pow(abs,3);
			temp += abs;
		}
		temp = Math.pow(temp, (1.0/3.0));
		System.out.println(temp);
		temp = 0.0;

		for(int i=0;i<n; i++){		//?????????
			double abs = 0;
			abs = vect1[i] - vect2[i];
			abs = Math.abs(abs);
			if(abs>temp){
				temp = abs;
			}
		}
		
		System.out.println(temp);
		temp = 0.0;
	}
}