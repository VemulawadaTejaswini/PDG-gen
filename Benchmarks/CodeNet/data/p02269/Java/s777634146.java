import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

// ALDS1_4_C
public class Main {
	void run() throws IOException {
		LinkedList<String> dic = new LinkedList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			switch(str[0]) {
			case "insert":
				dic.add(str[1]);
				break;
			case "find":
				if (dic.contains(str[1])) System.out.println("yes");
				else System.out.println("no");
				break;
			default:
				break;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		new Main().run();
	}
}

