import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] ch = scn.nextLine().toCharArray();
		int R = 0, B = 0;
		for(int i = 0;i < ch.length;i++) {
			if(ch[i] == '0') {
				R++;
			}else {
				B++;
			}
		}
		System.out.println(Math.min(R, B)*2);
	}

}
