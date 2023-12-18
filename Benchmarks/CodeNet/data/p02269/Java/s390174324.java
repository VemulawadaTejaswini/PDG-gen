import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Set<String> set = new HashSet<>();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");

			if(str[0].equals("insert")){
				set.add(str[1]);
			}else {
				if((set.contains(str[1])) !=false){
					sb.append("yes");
					sb.append("\n");
				}else {
					sb.append("no");
					sb.append("\n");
				}
			}


		}

		System.out.print(sb);
	}

}