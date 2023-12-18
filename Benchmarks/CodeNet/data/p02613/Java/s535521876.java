import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = "";
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0;i < 4;i++) {
			list.add(0);
		}

		for(int i = 0;i < n;i++) {
			s = scan.next();

			if(s.equals("AC")) {
				list.set(0 , list.get(0) + 1);
			}else if(s.equals("WA")) {
				list.set(1 , list.get(1) + 1);
			}else if(s.equals("TLE")) {
				list.set(2 , list.get(2) + 1);
			}else {
				list.set(3 , list.get(3) + 1);
			}
		}

		System.out.println("AC x " + list.get(0));
		System.out.println("WA x " + list.get(1));
		System.out.println("TLE x " + list.get(2));
		System.out.println("RE x " + list.get(3));
	}
}
