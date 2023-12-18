import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		new Main().run();
	}
	public void run() {
		try {
			// ??????????????????????????????
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				int imputNumber = Integer.parseInt(br.readLine());
				if(imputNumber == 0){
					break;
				} else {
					System.out.println(calc(imputNumber));
				}
			}

		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}
	private static int calc(int inputNumber){
		int count = 0;
		int maxNum = inputNumber%2 == 0 ? inputNumber/2 : inputNumber/2 + 1;
		int nTmp = 0;
		for (int presentMaxNum = maxNum; presentMaxNum > 0; presentMaxNum--){
			for (int content = presentMaxNum; content > 0; content--) {
				nTmp = nTmp + content;
				if(nTmp < inputNumber) {
					continue;
				} else if (nTmp == inputNumber) {
					count++;
					nTmp = 0;
					break;
				} else if (nTmp > inputNumber) {
					nTmp = 0;
					break;
				}
			}
		}
		return count;
	}
}