import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean flg = true;
		String text = sc.next();
		String[] texts = text.split("");
		
		for(int i=0; i<texts.length; i++) {
			if((texts[i].equals("U")) || (texts[i].equals("D"))) {
				continue;
			}
			if(i%2==0) {
				if(!texts[i].equals("R")) {
					flg = false;
					break;
				}
			}else if(i%2==1) {
				if(!texts[i].equals("L")) {
					flg = false;
					break;
				}
			}
		}
		
		if(flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
