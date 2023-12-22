import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		String[] arrStr;
		int cntDivisor = 0;
		try {
			str = br.readLine();
			arrStr = str.split(" ");

			int s = Integer.parseInt(arrStr[0]);
			int e = Integer.parseInt(arrStr[1]);
			int chk = Integer.parseInt(arrStr[2]);

			for (int i =s; i <= e; i++) {
				if(chk%i ==0){
					cntDivisor++;
				}
			}

			System.out.println(cntDivisor);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}