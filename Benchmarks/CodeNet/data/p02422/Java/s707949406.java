import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {

		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		StringBuilder moji = new StringBuilder(br.readLine());
		int x = Integer.parseInt(br.readLine());
		for (int i = 0; i < x; i++) {

			Scanner sc = new Scanner(br.readLine());
			String com = sc.next();
			int start = sc.nextInt();
			int end = sc.nextInt();
			if (com.equals("print"))
				System.out.println(moji.substring(start, end + 1));
			else if (com.equals("replace")) {
				String rep=sc.next();
				moji.replace(start, end+1, rep);
				}
			else {
				StringBuilder stb=new StringBuilder(moji.substring(start, end+1).toString());
				stb.reverse();
				moji.replace(start, end+1, stb.toString());
			}
			sc.close();
		}

	}

}