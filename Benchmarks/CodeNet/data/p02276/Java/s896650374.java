import java.io.*;
import java.util.*;

public class Main{
	public static int max = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = (br.readLine()).split(" ");
		int[] num = new int[n];
		for (int i = 0; i<n ; i++ ) {
			num[i] = Integer.parseInt(str[i]);
		}

		int part = partition(num,0,n-1);

		for (int i = 0; i<n ; i++ ) {
			if (i == n-1) {
				System.out.println(num[i]);
			}else if (i == part){
				System.out.print("[" + num[i] + "] ");
			}else{
				System.out.print(num[i] +" ");
			}
		}

	}

	public static int partition(int[] a ,int p,int r){
		int x = a[r];
		int i = p-1;
		for (int j = p; j<r ; j++ ) {
			if (a[j] <= x)  {
				i++;
				int work = a[i];
				a[i] = a[j];
				a[j] = work; 
			}
		}
		int num = a[i+1];
		a[i+1] = a[r];
		a[r] = num;

		return i+1;
	}

	public static void printing(int[] a){
		for (int i = 0; i<a.length ; i++ ) {
			if (i == a.length-1) {
				System.out.println(a[i]);
			}else{
				System.out.print(a[i] + " ");
			}
		}
	}
}