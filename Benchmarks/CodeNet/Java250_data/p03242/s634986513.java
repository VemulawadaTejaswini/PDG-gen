import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String res = "";
		for(int i=0;i<s.length();i++) {
			if(s.substring(i,i+1).equals("1")) {
				res+="9";
			}else {
				res+="1";
			}
		}
		System.out.println(res);
	}

}


