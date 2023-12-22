import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] p = new int[M];
		String[] S = new String[M];
		for(int i = 0;i < M;i++){
			p[i] = sc.nextInt();
			S[i] = sc.next();
		}
		sc.close();

		int[] WA = new int[105000];
		boolean[] AC = new boolean[105000];
		int WAnum = 0;
		int ACnum = 0;
		for(int i = 0;i < N;i++){
			WA[i+1] = 0;
			AC[i+1] = false;
		}
		for(int i = 0;i < M;i++){
			if(AC[p[i]])continue;
			if(S[i].equals("AC")){
				AC[p[i]] = true;
				ACnum++;
				WAnum += WA[p[i]];
			}else if(S[i].equals("WA")){
				WA[p[i]]++;
			}
		}
		System.out.println(ACnum + " " + WAnum);
	}
}