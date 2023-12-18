import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			sb.append((s.charAt(i)>='A' && s.charAt(i)<='Z')?(s.charAt(i)-'A'+'a'):(s.charAt(i)-'a'+'A'));
			if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
				System.out.print((char)(s.charAt(i)-'A'+'a'));
			}else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
				System.out.print((char)(s.charAt(i)-'a'+'A'));
			}else{
				System.out.print(s.charAt(i));
			}
			
		}
		System.out.println();
	}

}