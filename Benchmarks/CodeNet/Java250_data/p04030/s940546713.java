import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String keyboard = sc.next();
		char[] keychars = keyboard.toCharArray();
		
		String editer = "";
		for(char c:keychars) {
			switch(c) {
				case '0':
					editer += "0";
					break;
				case '1':
					editer += "1";
					break;
				case 'B':
					if(editer.length() == 0) {break;}
					editer = editer.substring(0,editer.length()-1);
			}
		}
		
		System.out.println(editer);
		sc.close();
		
	}

}