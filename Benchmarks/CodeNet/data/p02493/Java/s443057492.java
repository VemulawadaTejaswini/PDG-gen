import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++){
			System.out.print(a[n-i-1]);
			if(i==n-1){
				System.out.println();
				break;
			}
			System.out.print(" ");
		}
		
	}
}