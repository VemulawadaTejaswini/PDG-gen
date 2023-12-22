import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int V[]=new int[N];
		int C[]=new int[N];
		int result=0;
		for(int i=0;i<N;i++) {
			V[i]=sc.nextInt();
		}
		for(int j=0;j<N;j++) {
			C[j]=sc.nextInt();
		}
		for(int k=0;k<N;k++) {
			if(V[k]>C[k]) {
				result=result+V[k]-C[k];
			}
		}
		System.out.println(result);
	}
}