import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int [N];
		int a=0;
		int b=0;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		while(b==0) {
			for(int k=0;k<N;k++) {
				if(A[k]%2==0) {
					A[k]=A[k]/2;
				}else {
					b=1;
					a=a-1;
					break;
				}
			}
			a=a+1;
		}
		System.out.println(a);
	}
}