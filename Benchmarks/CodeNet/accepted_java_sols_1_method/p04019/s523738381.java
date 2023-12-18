import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		for (String line; (line = tec.readLine()) != null;) {
			boolean[] arr = new boolean[4];
			line=line.toUpperCase();
			for (int i = 0; i < line.length(); i++) {
				switch (line.charAt(i)) {
				case 'S':
					arr[0] = true;
					break;
				case 'N':
					arr[1] = true;
					break;
				case 'W':
					arr[2] = true;
					break;
				case 'E':
					arr[3] = true;
					break;
				}
			}
			if(arr[0]==arr[1]&&arr[2]==arr[3]){
				out.println("Yes");
			}else{
				out.println("No");
			}

		}
		out.close();
	}

}
