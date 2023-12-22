import java.util.Scanner;



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int a[] = new int[N+1];
		int count =0;
		a[0] =0;
		for (int i=0;i<S.length()-1;i++) {
			if (S.charAt(i)=='A'&&S.charAt(i+1)=='C') {
				count ++;
			}
			a[i+1]=count;
		}
		for (int i=0;i<Q;i++) {
			int start = sc.nextInt();
			int end =sc.nextInt();
			System.out.println(a[end-1]-a[start-1]);
		}
	}
}
