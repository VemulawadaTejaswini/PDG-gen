import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int[] A=new int[N+1];
	int[] B=new int[N];
	for(int i=0;i<N+1;i++) {
		A[i]=sc.nextInt();
	}
	long ans=0;
	for(int i=0;i<N;i++) {
		B[i]=sc.nextInt();
	}
	for(int i=0;i<N;i++) {
		if(B[i]<=A[i]) {
			ans+=B[i];
		}else if(B[i]<=A[i]+A[i+1]) {
			ans+=B[i];
			A[i+1]-=B[i]-A[i];
		}else {
			ans+=A[i]+A[i+1];
			A[i+1]=0;
		}
	}
	System.out.println(ans);

}
}
