import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;


		try {

			String inputed = br.readLine();

			for(int i = 0; i < inputed.length(); i++){
				ch = inputed.charAt(i);

				if(ch >= 'a' && ch <= 'z'){
					System.out.print((char)(ch-32));
				}else if(ch >= 'A' && ch <= 'Z'){
					System.out.print((char)(ch+32));
				}else{
					System.out.print((char)ch);
				}
			}
			System.out.printf("\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
