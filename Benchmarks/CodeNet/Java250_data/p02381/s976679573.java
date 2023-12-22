import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int n = 1;
		while(n != 0){
			n =scan.nextInt();
			if (n==0){
				break;
			}
			int[] score = new int[n];
			double heikin = 0.0;
			for(int i=0;i<n; i++){
				score[i] = scan.nextInt();
				heikin += score[i];
			}
			heikin /= n;
			double keisan = 0.0;
			for(int i=0; i<n; i++){
				keisan += (score[i] - heikin) * (score[i] - heikin);
			}
			keisan /= n;
			keisan = Math.sqrt(keisan);
			System.out.println(keisan);
		}
	}
}