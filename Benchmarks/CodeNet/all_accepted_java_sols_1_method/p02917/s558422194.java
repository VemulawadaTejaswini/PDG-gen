import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int B[]=new int[N-1];
	for(int i=0;i<B.length;i++) {
		B[i]=sc.nextInt();
	}
	int ans=B[0];
	for(int i=1;i<B.length;i++) {
		if(B[i-1]>B[i]) {
			ans+=B[i];
		}else {
			ans+=B[i-1];
		}
	}
	ans+=B[N-2];
	System.out.println(ans);

}
}
