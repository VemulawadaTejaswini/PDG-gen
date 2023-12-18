import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int A = N.charAt(0) - 48;
		int B = N.charAt(1) - 48;
		int C = N.charAt(2) - 48;
		int D = N.charAt(3) - 48;
		
		for (int i = 0; i < 8; i++) {
			String bit = Integer.toBinaryString(i);
			bit = String.format("%3s", bit).replaceAll(" ", "0");
			int count = 0;
			count = bit.charAt(0) == '0' ? A - B : A + B;
			count = bit.charAt(1) == '0' ? count - C : count + C;
			count = bit.charAt(2) == '0' ? count - D : count + D;
			
			if (count == 7) {
				char op1 = bit.charAt(0) == '0' ? '-' : '+';
				char op2 = bit.charAt(1) == '0' ? '-' : '+';
				char op3 = bit.charAt(2) == '0' ? '-' : '+';
				System.out.println(A + "" +  op1 + "" + B + "" + op2 + "" + C + "" + op3 + "" + D + "=7"); 
				break;
			}
		}
	}
}