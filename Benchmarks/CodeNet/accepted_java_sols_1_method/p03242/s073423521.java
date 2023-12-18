import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		String t="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1')t+='9';
			else t+="1";
		}
		System.out.println(t);
	}

}
