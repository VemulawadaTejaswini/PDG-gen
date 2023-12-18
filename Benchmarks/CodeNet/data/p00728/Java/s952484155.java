import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
//		Random rnd = new Random();
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int[] ten = new int[n];
			int sum=0;
			for(int i=0; i<n; i++){
				ten[i] = sc.nextInt();
				sum += ten[i];

			}
			int max=0, min=1000;
			for(int i=0; i<n; i++){
				if(ten[i]<min){
					min = ten[i];
				}
				if(ten[i]>max){
					max = ten[i];
				}
			}			

			sum -= min + max;
			
			System.out.println(sum/(n-2));

		}
	}
}