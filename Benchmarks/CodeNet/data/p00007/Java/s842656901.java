import java.io.*;

public class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		int result = 100000;
		try {
			while((str = br.readLine()) != "") {
				int num = Integer.parseInt(str);
				for(int i=0; i<num; i++) {
					result += result / 100 * 5;
					if(result % 1000 != 0) {
						result = (result / 1000 + 1) * 1000;
					}
				}
				System.out.println(result);
			}
		} catch(Exception e) {
			e.getMessage();
		}
	}
}