import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] n = new int[N];
		
		for(int i = 0; i < N; i++)
			n[i] = sc.nextInt()*60 + sc.nextInt();
		
		int M = sc.nextInt();
		int[] m = new int[M];
		
		for(int i = 0; i < M; i++)
			m[i] = sc.nextInt()*60 + sc.nextInt();
		
		int[] nm = new int[N+M];
		for(int i = 0; i < N; i++)
			nm[i] = n[i];
		for(int i = 0 ; i < M; i++)
			nm[N+i] = m[i];
		Arrays.sort(nm);
		int count=0;
		for(int i=1;i<nm.length;i++){
			if((nm[i]==nm[i-1])){
				nm[i-1]=0;count++;
			}
				
		}
		Arrays.sort(nm);
		for(;count < N+M; count++)
			System.out.printf("%d:%02d ",nm[count]/60, nm[count]%60);
			System.out.println();
	}
}