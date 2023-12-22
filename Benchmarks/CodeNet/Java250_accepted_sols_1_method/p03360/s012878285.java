import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int k = sc.nextInt();

		if(a < b){
			int temp = a;
			a = b;
			b = temp;
		}

		if(a < c){
			int temp = a;
			a = c;
			c = temp;	
		}

		int maxSum = a;
		for(int i=1; i<=k; i++){
			maxSum = maxSum * 2;
		}

		maxSum += b;
		maxSum += c;

		System.out.println(maxSum);
		
	}
}
