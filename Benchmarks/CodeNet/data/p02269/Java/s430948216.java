import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer dictionary = new StringBuffer();
		StringBuffer ans = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			String[] order = br.readLine().split(" ");
			if (order[0].contains("insert")) {
				dictionary.append(order[1]);
			} else {
				if(dictionary.toString().contains(order[1])) {
					ans.append("yes" + "\n");
				} else{
					ans.append("no" + "\n");
				}
			}
		}
		System.out.print(ans.toString());
	}
}