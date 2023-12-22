import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		String[] Arrays = new String[s.length()];
		String ans = "";
		int count;
		
		
		for(int i = 0;i<s.length();i++){
			Arrays[i]= String.valueOf(s.charAt(i));
		}
		count = s.length()-2;
		ans = Arrays[0];
		ans = ans + String.valueOf(count);
		ans = ans + Arrays[s.length()-1];
		
		System.out.println(ans);
	}

}
