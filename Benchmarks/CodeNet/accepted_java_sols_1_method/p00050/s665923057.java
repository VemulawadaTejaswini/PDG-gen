import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String str1 = line.replaceAll("apple", "テンプ");
		String str2 = str1.replaceAll("peach", "apple");
		String str3 = str2.replaceAll("テンプ", "peach");
        System.out.println(str3);
	}
}