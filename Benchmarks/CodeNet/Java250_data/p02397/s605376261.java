
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		String[] arrStr;
		StringBuilder output = new StringBuilder();
		int a,b;
		try {

			while(true){
				str = br.readLine();

				if(str.equals("0 0")){
					// ??????
					break;
				}

				arrStr = str.split(" ");
				a = Integer.parseInt(arrStr[0]);
				b = Integer.parseInt(arrStr[1]);

				if(a<b){
					output.append(a).append(" ").append(b).append("\n");
				}else{
					output.append(b).append(" ").append(a).append("\n");
				}
			}
			System.out.print(output.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}