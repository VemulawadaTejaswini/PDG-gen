import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = S.replace("dreameraser", "0");
		String ans2 = ans.replace("dreamerase", "0");
		String ans3 = ans2.replace("dreamer", "0");
		String ans4 = ans3.replace("dream", "0");
		String ans5 = ans4.replace("eraser", "0");
		String ans6 = ans5.replace("erase", "0");
		String ans7 = ans6.replace("0", "");
		System.out.println(ans7.equals("") ? "YES" :"NO");
	}
}