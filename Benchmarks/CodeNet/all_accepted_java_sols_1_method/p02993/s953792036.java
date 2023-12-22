import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		boolean good = true;
		for(int i=0;i<3;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				good = false;
				break;
			}
		}
		System.out.println(good?"Good":"Bad");
		in.close();
	}

}
