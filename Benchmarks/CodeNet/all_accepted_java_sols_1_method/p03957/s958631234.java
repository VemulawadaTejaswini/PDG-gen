import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		boolean c = false;
		for(int i =0;i<s.length();i++){
			if(s.charAt(i)=='C'){
				c = true;
				continue;
			}
			if(c==true && s.charAt(i)=='F'){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
