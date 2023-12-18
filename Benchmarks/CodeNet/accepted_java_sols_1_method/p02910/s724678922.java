import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String tap = reader.nextLine();
		boolean ban = true;
		char paso;
		for(int i=1;i<=tap.length();i++) {
			paso = tap.charAt(i-1);
			if((i & 1)==1) {
				if(paso != 'R' && paso != 'U' && paso != 'D') {
					ban = false;
					break;
				}
			}else {
				if(paso != 'L' && paso != 'U' && paso != 'D') {
					ban = false;
					break;
				}
			}
		}
		if(ban)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
