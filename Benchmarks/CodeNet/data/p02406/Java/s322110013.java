import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		int numN;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String line = br.readLine();

			numN = Integer.parseInt(line);

			//????????¨
			String outputNum = "";
			for (int i = 1; i <= numN; i++) {
				if(i % 3 == 0){
					outputNum += i + " ";
				}else if (i % 10 == 3) {
					outputNum += i + " ";
				}
			}
			//???????????????
			System.out.println(outputNum);
		}catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}