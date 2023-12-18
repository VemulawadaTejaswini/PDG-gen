import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N =sc.nextInt();
		int t[][] =new int[N][2];
		for (int i = 0; i < N; i++) {
			t[i][0]=sc.nextInt();
			t[i][1]=sc.nextInt();
		}
		
		int M =sc.nextInt();
		int y[][] =new int[M+N][2];
		for (int i = 0; i < M; i++) {
			y[i][0]=sc.nextInt();
			y[i][1]=sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			y[M+i][0]=t[i][0];
			y[M+i][1]=t[i][1];
		}
		
		Arrays.sort(y,new Comparator<int[]>() {
			public int compare(int a[], int b[]) {
				return a[1] - b[1];
			}
		});
		Arrays.sort(y,new Comparator<int[]>() {
			public int compare(int a[], int b[]) {
				return a[0] - b[0];
			}
		});
		for (int i = 0; i < N+M; i++) {
			System.out.print(y[i][0]+":"+String.format("%1$02d", y[i][1]));
			if(N+M-1==i)break;
			System.out.print(" ");
		}
		System.out.println();
	}
}