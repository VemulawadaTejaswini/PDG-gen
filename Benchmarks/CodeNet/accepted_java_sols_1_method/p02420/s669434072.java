import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String result ;
		int count = 0;

		while (true) {
			String str = br.readLine();
			if (str.equals("-")) {
				break;
			}

			String res = br.readLine();
			count = Integer.parseInt(res);
			int[] shuffle = new int[count];
			for(int i =0; i < count; i++){
				String shuffler = br.readLine();
				shuffle[i] = Integer.parseInt(shuffler);
				result = str.substring(0,shuffle[i]);
				
				str += result;
				str = str.substring(shuffle[i]);
			}
			System.out.println(str);
		}
	}
}