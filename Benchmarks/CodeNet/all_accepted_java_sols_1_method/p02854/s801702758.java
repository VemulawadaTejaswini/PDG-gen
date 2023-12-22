import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	long A[]=new long[N];
	long sum=0;
	for(int i=0;i<N;i++) {
		A[i]=sc.nextLong();
		sum+=A[i];
	}
	long karisum=0;
	long ans=0;
	for(int i=0;i<N;i++) {
		karisum+=A[i];
		if(karisum>=(double)sum/2) {
			if(karisum-A[i]>sum-karisum)
			karisum-=A[i];
			ans=Math.abs(sum-2*karisum);
			break;
		}

	}
	System.out.println(ans);

}
}