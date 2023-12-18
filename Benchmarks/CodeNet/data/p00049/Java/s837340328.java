import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner stdin = new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String blood = null;
		String[] str = new String[2];
		Arrays.fill(str, null);
		
		int a = 0;
		int b = 0;
		int ab = 0;
		int o = 0;

		for(int i = 0; i < 5; i++) {


			try {
				blood = input.readLine();
				str = blood.split("\\,");

				if(str[1].equals("A")) {
					a++;
				}

				if(str[1].equals("B")) {
					b++;
				}

				if(str[1].equals("AB")) {
					ab++;
				}

				if(str[1].equals("O")) {
					o++;
				}
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}

		}


		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);


	}

}