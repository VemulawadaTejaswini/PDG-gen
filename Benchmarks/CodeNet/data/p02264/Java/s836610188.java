import java.util.Scanner;

public class Main {
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int q = sc.nextInt();
		String[] name = new String[N];
		int[] time = new int[N];
		int tlen = 0;
		int cnt = 0;
		int icnt = 0;
		for (int i=0; i<N; i++) {
			name[i] = sc.next();
			time[i] = sc.nextInt();
		}
		
		while (cnt < N) {
			if(time[icnt] == 0) {
			} else if (time[icnt] > 100){
				time[icnt] -= 100;
				tlen += 100;
			} else {
				tlen += time[icnt];
				time[icnt] = 0;
				System.out.println(name[icnt] + " " + tlen);
				cnt++;
			}
			icnt++;
			if(icnt > N-1) icnt -= 5;
		}
	}
}

