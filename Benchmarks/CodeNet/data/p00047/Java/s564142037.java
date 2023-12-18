
import java.io.*;

public class Main {
	static boolean A=true, B=false, C=false;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while((input = br.readLine()) != null) {
			if(input.isEmpty()) break;
			String[] split = input.split(",");
			if(split[0].equals("A") || split[1].equals("A")) {
				if(split[0].equals("B") || split[1].equals("B")) {
					changeAB();
				}
				else if(split[0].equals("C") || split[1].equals("C")) changeCA();
			}
			else changeBC();
		}
		if(A) System.out.println("A");
		else if(B) System.out.println("B");
		else if(C) System.out.println("C");
	}
	public static void changeAB() {
		boolean tmp;
		tmp = A;
		A = B;
		B = tmp;
	}
	public static void changeBC() {
		boolean tmp;
		tmp = C;
		C = B;
		B = tmp;
	}
	public static void changeCA() {
		boolean tmp;
		tmp = A;
		A = C;
		C = tmp;
	}
}