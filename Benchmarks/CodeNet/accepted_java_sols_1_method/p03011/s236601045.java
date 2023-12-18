import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int P=sc.nextInt();
		int Q=sc.nextInt();
		int R=sc.nextInt();
		sc.close();
		int max=P;
		int result;
		if(max<Q) {
			max=Q;
		}
		if(max<R) {
			max=R;
		}
		result=P+Q+R-max;
		System.out.println(result);
	}
}