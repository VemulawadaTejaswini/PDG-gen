import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		for(int i=0; i<N; i++)d[i] = sc.nextInt();

		Arrays.sort(d);
		int ans=0;

		for(int i=0; i<N-1; i++){
			if(d[i+1]!=d[i]){
				ans ++;
			}
		}
		ans++;
		System.out.print(ans);
	}	
}
