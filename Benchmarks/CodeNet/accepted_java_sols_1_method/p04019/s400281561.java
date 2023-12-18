import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		boolean[] count = {false,false,false,false};
		for(int i = 0; i < S.length(); i++) {
			char let = S.charAt(i);
			switch(let) {
			case 'N':
				count[0]=true;
				break;
			case 'S':
				count[1]=true;
				break;
			case 'E':
				count[2]=true;
				break;
			case 'W':
				count[3]=true;
				break;
			}
		}

		if(!(count[0]^count[1]) && !(count[2]^count[3])) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
