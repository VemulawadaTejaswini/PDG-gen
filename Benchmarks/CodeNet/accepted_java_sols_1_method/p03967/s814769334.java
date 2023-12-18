import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		char[]s = stdIn.next().toCharArray();

		//パーの回数＜＝グーの回数

		int cntp = 0;
		int cntg = 0;
		int lose = 0;
		int aiko = 0;

		for(int i = 0; i < s.length; i++) {
			if(s[i]=='g' && cntp < cntg) {
				cntp++;
			}else if(s[i] == 'g' && cntp==cntg) {
				cntg++;
			}else if(s[i]=='p'&& cntp < cntg) {
				cntp++;
				aiko++;
			}else {
				lose++;
				cntg++;
			}
		}

		System.out.println(cntp-aiko-lose);


	}

}
