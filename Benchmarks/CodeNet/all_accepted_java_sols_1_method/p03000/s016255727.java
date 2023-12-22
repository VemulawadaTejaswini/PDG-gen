import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String[] spl1 = s1.split(" ");
		int N = Integer.parseInt(spl1[0]);
		int X = Integer.parseInt(spl1[1]);
		String s2 = sc.nextLine();
		String[] spl2 = s2.split(" ");
		int[] L = new int[N];
		for(int i = 0;i < N;i++){
			L[i] = Integer.parseInt(spl2[i]);
		}
		sc.close();

		int cnt = 1;
		int D = 0;
		for(int i = 0;i < N;i++){
			D += L[i];
			if(D > X)break;
			cnt++;
		}
		System.out.println(cnt);
	}
}