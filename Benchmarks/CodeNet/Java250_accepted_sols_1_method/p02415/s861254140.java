import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			String str=scan.nextLine();
			char c[] =str.toCharArray();
			for(int i=0;i<str.length();i++) {
				if(Character.isLowerCase(c[i])) {
					c[i] =Character.toUpperCase(c[i]);
				}else{
					c[i] =Character.toLowerCase(c[i]);
				}
				System.out.print(c[i]);
			}
			
		System.out.printf("\n");
		scan.close();
}
}
