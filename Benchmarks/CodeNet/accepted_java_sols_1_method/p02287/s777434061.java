import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] s = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		for(int ind = 1; ind <= n; ++ind) {
			sb.append("node " + ind + ": key = " + s[ind - 1] + ", ");
			if(0 < ind/2 && ind/2 <= n) {
				sb.append("parent key = " + s[ind/2 - 1] + ", ");
			}
			if(ind * 2 <= n){
				sb.append("left key = " + s[ind * 2 - 1] + ", ");
			}
			if(ind * 2 + 1 <= n){
				sb.append("right key = " + s[ind * 2 + 1 - 1] + ", ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}

}