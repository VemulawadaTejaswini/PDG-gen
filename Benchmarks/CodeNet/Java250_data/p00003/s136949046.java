
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
class Main {
	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		ArrayList<String> output = new ArrayList<String>();
		String input;
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				input = br.readLine();
				int[] sides = new int[3];
				sides[0] = Integer.parseInt(input.split(" ")[0]);
				sides[1] = Integer.parseInt(input.split(" ")[1]);
				sides[2] = Integer.parseInt(input.split(" ")[2]);
				Arrays.sort(sides);
				if(sides[2]*sides[2]-sides[1]*sides[1]-sides[0]*sides[0]==0){
					output.add("YES");
				}else{
					output.add("NO");
				}
			}
			for (String i : output) {
				System.out.println(i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}