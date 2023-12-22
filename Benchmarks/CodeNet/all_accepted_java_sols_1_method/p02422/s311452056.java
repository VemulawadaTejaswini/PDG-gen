import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		char[] c = line1.toCharArray();
		int len = line1.length();
		String num = br.readLine();
		int q = Integer.parseInt(num);
		String ans = "";
		for (int i = 0 ; i<q ; i++ ) {
			String line = br.readLine();
			String[] str = line.split(" ");
			int a = Integer.parseInt(str[1]);
			int b = Integer.parseInt(str[2]);
		char[] e = (char[]) c.clone();
			if (str[0].equals("replace")) {
				char[] d = str[3].toCharArray();
				for (int j = 0 ; j <= b-a  ; j++ ) {
					c[a+j] = d[j];
				}

			}else if(str[0].equals("reverse")){
				for (int j = 0 ; j <= (b-a)  ; j++ ) {
					c[a+j] = e[b-j];

				}

			}else if(str[0].equals("print")){
				for (int j = 0 ; j<=b-a ; j++ ){
					ans += String.valueOf(c[a+j]);
				} 
				System.out.println(ans);
				ans = "";
			}
		}

	}
}