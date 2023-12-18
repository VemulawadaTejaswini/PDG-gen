import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		String s,p;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		p = sc.nextLine();
		for(int i = 0; i < s.length(); i++){
			if(p.equals(s.substring(0,p.length()))){
				System.out.println("Yes");
				System.exit(0);
			}
			s = s.substring(s.length() - 1, s.length()) + s.substring(0,s.length() - 1);
		}
		System.out.println("No");
	}
}