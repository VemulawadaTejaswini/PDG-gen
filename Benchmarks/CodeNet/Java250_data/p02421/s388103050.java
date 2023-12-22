import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		int pA = 0, pB = 0;

		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int cnt = 0;
		while (cnt < num) {
			String tmp = scan.nextLine();
			String a = tmp.split(" ")[0];
			String b = tmp.split(" ")[1];
			int turncnt = 0;
			cnt++;
			if(a.equals(b)){
				pA++;
				pB++;
				continue;
			}
			while (true) {
				char[] cA = a.toCharArray();
				char[] cB = b.toCharArray();

				if (turncnt == a.length() || turncnt == b.length()) {
					if(cA.length > cB.length){
						pA += 3;
					}else if(cA.length < cB.length){
						pB += 3;
					}
					break;
				}

				if (cA[turncnt] > cB[turncnt]) {
					pA += 3;
					break;
				} else if (cA[turncnt] < cB[turncnt]) {
					pB += 3;
					break;
				}
				turncnt++;
			}
		}
		System.out.println(pA + " " + pB);
	}

}

