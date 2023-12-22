import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int[] l = new int[Q];
		int[] r = new int[Q];
		for (int i=0;i<Q;i++) {
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}
		int[] SUM = new int[N];
		for (int i=0;i<N-1;i++) {
			if (S.charAt(i)=='A') {
				if (i!=S.length()-1 && S.charAt(i+1)=='C') {
					SUM[i+1]=SUM[i]+1;
				}else {
					SUM[i+1]=SUM[i];
				}
			}else {
					SUM[i+1]=SUM[i];
			}
		}

		for (int i=0;i<Q;i++) {
			System.out.println(SUM[r[i]-1]-SUM[l[i]-1]);
		}
	}
}