import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] n  = sc.nextLine().toCharArray();
		String ans = "No";
		long culc = 0;

		for(char num : n) {
			culc += Integer.parseInt(String.valueOf(num));
		}
		
		if(culc % 9 == 0) {
			ans = "Yes";
		}
		
		System.out.println(ans);
		sc.close();
	}
}


