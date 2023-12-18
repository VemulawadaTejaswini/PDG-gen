import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.print(" ");
		Scanner scan = new Scanner(System.in);
		int r =scan.nextInt();
		int c =scan.nextInt();
		int num[][] = new int[100][101]; //num[???][?¨?]
		int sumsum[] = new int [101];
		int sum = 0;
		
		for(int i =0; i<r; i++){
			sum = 0;
			for(int ii=0;ii<c;ii++){
				num[ii][i] = scan.nextInt();
				sum += num[ii][i];
				System.out.print(num[ii][i]+" ");
			}
			System.out.println(sum);
		}
		
		for(int i =0; i<r; i++){
			for(int ii=0;ii<c;ii++){
				sumsum[ii] += num[ii][i];
			}
		}
		
		sum = 0;
		for(int i=0; i<c; i++){
			sum += sumsum[i];
			System.out.print(sumsum[i]+" ");
		}
		System.out.println(sum);
	}
}