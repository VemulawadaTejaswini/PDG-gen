import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int[] A=new int[N];
	int max=0;
	int secondMax=0;
	for(int i=0;i<N;i++) {
		A[i]=sc.nextInt();
		if(A[i]>max) {
			secondMax=max;
			max=A[i];
		}else if(A[i]>secondMax) {
			secondMax=A[i];
		}
	}
	for(int i=0;i<N;i++) {
		if(A[i]==max) {
			System.out.println(secondMax);
		}else {
			System.out.println(max);
		}
	}
}
}