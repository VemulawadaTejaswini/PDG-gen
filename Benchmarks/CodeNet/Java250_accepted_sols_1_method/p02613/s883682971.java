
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		int testNum;
		int judgeAC = 0;
		int judgeWA = 0;
		int judgeTLE = 0;
		int judgeRE = 0;


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			testNum =Integer.parseInt(reader.readLine());

			for (int i = 0; i < testNum; i++) {
				String judge = reader.readLine();
//				if (judge == "AC") {
//					judgeAC++;
//				}
				if (judge.equals("AC")) {
					judgeAC++;
				}
				else if (judge.equals("WA")) {
					judgeWA++;
				}
				else if (judge.equals("TLE")) {
					judgeTLE++;
				}
				else if(judge.equals("RE")) {
					judgeRE++;
				}
			}
			System.out.println("AC x "+judgeAC);
			System.out.println("WA x "+judgeWA);
			System.out.println("TLE x "+judgeTLE);
			System.out.println("RE x "+judgeRE);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
