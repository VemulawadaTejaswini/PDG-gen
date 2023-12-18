import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long a = 26;
		
		char[] al = new char[26];
		String[] alp = new String[26]; 
		for(int i = 0; i<26;i++) {
			al[i] = (char)(97+i);
			alp[i] = String.valueOf(al[i]);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		
		while(true) {
			if(n < 26) {
				list.add(alp[(int) n-1]);
				break;
			}
			long end = n % a;			
			list.add(alp[(int) end-1]);
			long ans = n / a;
			if(ans < 27) {
				list.add(alp[(int) ans-1]);
				break;
			}
			n = ans;
				
		}
		
		Collections.reverse(list);
		for(String item:list) {
			System.out.print(item);
		}
	}

}
