import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		String str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			String temp = br.readLine();
			if(str.contains(temp)){
				sb.append("1" + "\n");
			} else {
				sb.append("0" + "\n");
			}
		}
		System.out.print(sb.toString());
	}
}