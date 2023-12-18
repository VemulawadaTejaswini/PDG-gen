import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.next();
			if (str.length() == 1 && str.charAt(0) == '-') break;
			String buffer = "";
			int m = sc.nextInt();
			int h;
			for (int i = 0; i < m; i++){
				h = sc.nextInt();
				buffer = str.substring(str.length() - h, str.length());
				//System.out.println(buffer);
				str = str.substring(0, str.length() - h);
				//System.out.println(str);
				str = buffer + str;
				//System.out.println(str);
			}
			System.out.println(str);
		}
	}
}