import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		long[] a = new long[count];
		for(int i=0;i<count;i++) {
			a[i] = sc.nextLong();
		}
		
		for(int i=1;i<=count;i++) {
			System.out.print("node "+i+": key = "+a[i-1]+", ");
			if(i!=1) {
				System.out.print("parent key = "+a[i/2-1]+", ");
			}
			if(2*i<=a.length) {
				System.out.print("left key = "+a[2*i-1]+", ");
			}
			if(2*i<=a.length-1) {
				System.out.print("right key = "+a[2*i]+", ");
			}
			System.out.println();
		}
}}
