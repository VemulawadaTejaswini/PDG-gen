import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int count, h;

		while(true){
			str = sc.next();
			if(str.equals("-")) break;
			count = sc.nextInt();
			for(int i=0; i<count; i++){
				h = sc.nextInt();
				str = str.substring(h, str.length()) + str.substring(0, h);
			}
			System.out.println(str);
		}
	}
}