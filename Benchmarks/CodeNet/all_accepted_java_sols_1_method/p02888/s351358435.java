
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L[] = new int[N];
		
		for(int i=0;i<N;i++) {
			L[i]=sc.nextInt();
		}
		
		Arrays.sort(L);
		//小さい順に並んでいる。
		
		
		//三角形ができない組み合わせを数える。
		long count=0;
		long count_memo=0;
		
		int sh =0;
		int mi =0;
		int sum=0;
		for(int i=0;i<N-2;i++) {
			sh=L[i];
			for(int j=i+1;j<N-1;j++) {
				mi=L[j];
				sum = sh + mi;
				int k=L.length;
				count_memo=count;
				while(sum<=L[k-1]) {
					count++;
					k--;
				}
				if(count_memo==count) {
					break;
				}
			}
		}
		
		//組み合わせの総数　
		long total = (N*(N-1)*(long)(N-2))/(3*2); 
		
		long ans = total-count;
		
		System.out.println(ans);
	}
}
