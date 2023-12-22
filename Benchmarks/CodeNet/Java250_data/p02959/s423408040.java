import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] As = new int[N+1];
		for(int i=0; i<=N; i++) {
			As[i] = Integer.parseInt(sc.next());
		}
		long last = 0;
		long monsters = 0;
		for(int i=0; i<N; i++) {
			long ability = Integer.parseInt(sc.next());
			if(As[i] >= ability + last) {
				monsters += (ability+ last);
				last = 0;
			}else {
				monsters += As[i];
				if(last >= As[i]) {
					last = ability;
				}else {
					last = ability + last - As[i];	
				}
			}
		}
		sc.close();
		if(As[N] >=  last) {
			monsters +=  last;
		}else {
			monsters += As[N];
		}
		System.out.println(monsters);
	}
}