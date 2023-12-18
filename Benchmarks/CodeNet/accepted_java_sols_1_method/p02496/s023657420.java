import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int card;              // カードの枚数
		boolean[] S = new boolean[14]; // スペード
		boolean[] H = new boolean[14]; // ハート
		boolean[] C = new boolean[14]; // クローバー
		boolean[] D = new boolean[14]; // ダイヤ
		
		card = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= card; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String suit = st.nextToken();
			int number = Integer.parseInt(st.nextToken());
			if(suit.equals("S")) {
				
				S[number] = true;
				
			} else if (suit.equals("H")) {
				
				H[number] = true;
				
			} else if (suit.equals("C")) {
				
				C[number] = true;
				
			} else {
				
				D[number] = true;
				
			}
		}
		
		for (int i = 1; i <= 13; i++) {
			if (!S[i])
				System.out.println("S " + i);
		}
		for (int i = 1; i <= 13; i++) {
			if (!H[i])
				System.out.println("H " + i);
		}
		for (int i = 1; i <= 13; i++) {
			if (!C[i])
				System.out.println("C " + i);
		}
		for (int i = 1; i <= 13; i++) {
			if (!D[i])
				System.out.println("D " + i);
		}
	}
	
}