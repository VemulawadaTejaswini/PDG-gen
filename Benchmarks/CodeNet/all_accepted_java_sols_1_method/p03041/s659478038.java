import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");

		int N = Integer.parseInt(tmp[0]);
		int K = Integer.parseInt(tmp[1]);

		String S = br.readLine();

		for(int i = 0;i<N;i++){
			if(i+1 == K){
				int a = (int)S.charAt(i) + 32;
				byte[] ascii = {Byte.parseByte(String.valueOf(a))};
				String resultString = new String(ascii, "US-ASCII");
				System.out.print(resultString);
			}else{
				System.out.print(S.charAt(i));
			}
		}



	}

}