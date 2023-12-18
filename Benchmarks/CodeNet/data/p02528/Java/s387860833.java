import java.io.*;
import java.util.Scanner;

class Main {

	public static void main(String args[]) throws IOException {
		int n;
		Scanner in = new Scanner(System.in);
		
		n = Integer.parseInt(in.next());
		
		int[] num = new int[n];
		
		
		for(int i=0;i<n;i++){
			num[i] = Integer.parseInt(in.next());
		}
		
		int temp;
		
		for(int i=1;i<n;i++){
			for(int j=0;j<n-i;j++){
				if(num[j] > num[j+1]){
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<n-1;i++){
			System.out.print(num[i]+" ");
		}
		
		System.out.println(num[n-1]);
		
	}
}