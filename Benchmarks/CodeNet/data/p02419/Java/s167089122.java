import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner scan = new Scanner(System.in);

		String str1 = br.readLine();

		String str2;

		int count =0;

		while (true) {

			str2 = br.readLine();
			String[] st = str2.split(" ");

			if(st[0].equals("END_OF_TEXT")){
				break;
			}

				for(String s: st){
					if(s.equalsIgnoreCase(str1)){
						count++;

					}
				}
		}

		System.out.println(count);
 }

}