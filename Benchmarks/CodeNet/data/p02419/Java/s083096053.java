import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String W = buf.readLine();
		String str;
		int check;
		int end = -1;
		int count = 0;
		while (end == -1) {
			str = buf.readLine();
			check = 0;
			end = str.indexOf("END_OF_TEXT", 0);
			while(true) {
				check = str.indexOf(W, check) + 1;
				if (check == 0) break;
				if (end == -1 || check < end) {
					count += 1;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}

}