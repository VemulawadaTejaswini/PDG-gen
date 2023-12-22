import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N,num=0;
		N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++){
			for(int j=N-1;j>i;j--){
				if(A[j]<A[j-1]){
					int tmp=A[j];
					A[j]=A[j-1];
					A[j-1]=tmp;
					num++;
				}
			}
		}
		for(int i=0;i<N;i++){
			if(i==N-1){
				System.out.println(A[i]);
			}
			else{
				System.out.print(A[i]+" ");
			}
		}
		System.out.println(num);
	}
}
