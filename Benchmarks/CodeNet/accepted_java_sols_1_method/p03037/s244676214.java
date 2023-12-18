import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] spl = S.split(" ");
		int N = Integer.parseInt(spl[0]);
		int M = Integer.parseInt(spl[1]);
		String Si = "";
		int[] L = new int[M];
		int[] R = new int[M];
		for(int i = 0;i < M;i++){
			 Si = sc.nextLine();
			String[] Sispl = Si.split(" ");
			L[i] = Integer.parseInt(Sispl[0]);
			R[i] =Integer.parseInt(Sispl[1]);
			Si = "";
		}
		sc.close();
		int Lmax = 1;
		int Rmin = N;
		int cnt = 0;
		for(int j = 0;j < M;j++){
			Lmax = Math.max(L[j], Lmax);
			Rmin = Math.min(R[j], Rmin);
		}
		for(int k = 1;k <= N;k++){
			if(k >= Lmax && k <= Rmin){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}