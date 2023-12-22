import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] p = new int[M];
		int[] c = new int[N];
		int[] b = new int[N];
		int s = 0;
		int n = 0;
		for(int i=0; i<M; i++) {
			p[i] = (sc.nextInt()-1);
			String a = sc.next();
			if(b[p[i]] == 0) {
				if(a.equals("WA") ){
					c[p[i]]++;
				}else{
					b[p[i]]=1;
				}
			}
		}
		sc.close();
		for(int i=0; i<N; i++) {
			if(b[i]==1) {
				s++;
				n += c[i];
			}
		}
		if(n<0) n=0;
		System.out.println(s + " " + n);
	}

}