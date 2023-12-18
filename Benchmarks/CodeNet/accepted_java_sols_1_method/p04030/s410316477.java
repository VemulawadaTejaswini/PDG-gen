import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String result="";
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			switch(c[i]) {
			case '0':
				result += "0";
				break;
			case '1':
				result += "1";
				break;
			case 'B':
				if(!result.equals("")) {
					result = result.substring(0,result.length()-1);
				}
				break;
			}
		}
		System.out.println(result);
		scanner.close();
	}

}
