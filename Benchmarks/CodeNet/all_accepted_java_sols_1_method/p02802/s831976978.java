import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	int n = sca.nextInt();  // n問出題される
	int m = sca.nextInt();  // m回提出
	int[] pi = new int[m]; // i番目の問題番号
	String[] si = new String[m];  // i番目の提出の結果ACかWA

	for(int i = 0; i < m; i++) {
		pi[i] = sca.nextInt();
		si[i] = sca.next();
	}
	boolean[] flg = new boolean[n+1];
	for(int i = 0; i <= n; i++) {
		flg[i] = false;
	}
	int seito = 0;
	int penal = 0;
	int[] penal_loop = new int[n+1];



	for(int j = 0; j < m; j++) {
		// i番目の問題がまだ正解していないとき
		if(flg[pi[j]] == false) {
			if(si[j].equals("AC")) {
				seito++;
				flg[pi[j]] = true;
			}
			else if(si[j].equals("WA")) {
				penal_loop[pi[j]]++;
			}
		}
	}
	for(int i = 1; i <= n; i++) {
		if(flg[i] == true) {
			penal = penal + penal_loop[i];
		}
	}

	System.out.print(seito);
	System.out.print(" ");
	System.out.println(penal);

	// 後始末
	sca.close();
	}
}