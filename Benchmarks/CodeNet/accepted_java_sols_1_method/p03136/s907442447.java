import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[]x=new int[N];
		int max=0; int sum=0;
		for(int i=0;i<N;i++) {
			int L=sc.nextInt();
            x[i]=L;
            sum+=x[i];
		}
		max=x[0];
for(int j=1;j<N;j++) {
	if(max<x[j]) {
		max=x[j];
	}
	
}
if(max<sum-max) {
	System.out.print("Yes");
}
else if(max>=sum-max) {
	System.out.print("No");
}
		sc.close();
	}

}
