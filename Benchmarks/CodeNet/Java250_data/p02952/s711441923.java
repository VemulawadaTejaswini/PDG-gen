import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		int M=(int)Math.log10(N);
		int S=0;
		if(M%2==0) {
			for(int i=0;i<M/2;i++) {
				S+=9*(int)Math.pow(10, 2*i);
			}
			S+=(N+1-(int)Math.pow(10, M));
		}else {
			for(int j=0;j<=(M-1)/2;j++) {
				S+=9*(int)Math.pow(10, 2*j);
			}
		}
		System.out.println(S);
	}
}