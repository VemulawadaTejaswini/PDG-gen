import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void insertionSort(int num[],int n,int g,int cnt){
		for (int i = g; i<n ; i++ ) {
			int v = num[i];
			int j = i-g;
			while(j >= 0 && num[j] > v){
				num[j+g] = num[j];
				j = j-g;
				cnt++;
			}
			num[j+g] = v;
		}
	}

	public static void printseq(int[] s){
		for (int i = 0; i<s.length ; i++) {
			if ( i == s.length-1) {
				System.out.println(s[i]);
			}else{
				System.out.print(s[i] + " ");
			}
		}
	}

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		for (int i = 0; i<n ; i++ ) {
			num[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 0;
		int m = 1;
		int[] g = {1};
		for (int i = 0; i<m ; i++ ) {
			insertionSort(num,n,g[i],cnt);
		}
		System.out.println(m);
		printseq(g);
		for (int i = 0 ; i<num.length ; i++ ) {
			System.out.println(num[i]);
		}
	}
}