import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String line;
			String[] strArray = new String[3];
			boolean cntFlg = true;

			while (cntFlg == true){
				
				line = br.readLine();
				strArray = line.split("\\s");
				
				switch (strArray[1].charAt(0)) {
				case '+':
					System.out.println(Integer.parseInt(strArray[0])
							+ Integer.parseInt(strArray[2]));
					break;
				case '-':
					System.out.println(Integer.parseInt(strArray[0])
							- Integer.parseInt(strArray[2]));
					break;
				case '*':
					System.out.println(Integer.parseInt(strArray[0])
							* Integer.parseInt(strArray[2]));
					break;
				case '/':
					System.out.println(Integer.parseInt(strArray[0])
							/ Integer.parseInt(strArray[2]));
					break;
				case '?':
					cntFlg = false;
					break;
				default:
					break;
				}
			}
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}