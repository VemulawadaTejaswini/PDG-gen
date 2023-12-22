import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int n = scan.nextInt();
		int a[] = new int[n];
		int v[] = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = scan.nextInt();
			v[i] = scan.nextInt();
		}
		int maxA = a[0];
		int maxV = v[0];
		for(int i = 1 ; i < n ; i++){
			if(maxV < v[i]){
				maxA = a[i];
				maxV = v[i];
			}else if(maxV == v[i]){
				if(maxA > a[i]){
					maxA = a[i];
				}
			}
		}
		System.out.println(maxA + " " + maxV);
	}
}