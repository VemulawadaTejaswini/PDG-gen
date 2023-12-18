import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N,M;
		String ans,buf;
		String[] trf;
		while((N = scn.nextInt())!= 0) {
			trf = new String[N*2];
			for(int i = 0;i<2*N;i++) {
				trf[i] = scn.next();
			}
			M = scn.nextInt();
			ans = "";
			for(int i = 0;i < M;i++) {
				buf = scn.next();
				for(int j = 0;j < 2*N;j += 2) {
					if(buf.equals(trf[j])) {
						buf = trf[j+1];
						break;
					}
				}
				ans += buf;
			}
			System.out.println(ans);
		}
	}
}

