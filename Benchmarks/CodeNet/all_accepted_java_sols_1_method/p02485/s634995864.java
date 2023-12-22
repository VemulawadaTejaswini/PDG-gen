import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(scan.hasNext()){
			String s=scan.next();
			if(s.equals("0"))
				break;
			int sum=0;
			for (int i = 0; i < s.length(); i++) {
				sum +=s.charAt(i)-'0';
			}
			System.out.println(sum);
		}
	}

}