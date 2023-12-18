import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		boolean judge = true;
		for(int i = 0; i < s1.length(); i++){
			if(s1.charAt(i) != s2.charAt(s1.length()-1-i)){
				judge = false;
				break;
			}
		}
		System.out.println(judge ? "YES" : "NO");
	}
}
