import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int totalXOR = arr[0];
		for(int i=1; i<n; i++){
			totalXOR = totalXOR ^ arr[i];
		}
		for(int i=0; i<n;i++){
			System.out.print(arr[i]^totalXOR);
			System.out.print(" ");
		}
		
	}

}