import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] array = scanner.next().toCharArray();
 
		int a = Character.getNumericValue(array[0]);
		int b = Character.getNumericValue(array[1]);
		int c = Character.getNumericValue(array[2]);
		int d = Character.getNumericValue(array[3]);
 
		String op1 = "+";
		String op2 = "+";
		String op3 = "+";
 
		int ans = a;
 
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					ans = a;
					if (i == 0) {
						ans += b;
					} else {
						ans -= b;
					}
					if (j == 0) {
						ans += c;
					} else {
						ans -= c;
					}
					if (k == 0) {
						ans += d;
					} else {
						ans -= d;
					}
					if(ans == 7){
						if(i == 1){
							op1 = "-";
						}
						if(j == 1){
							op2 = "-";
						}
						if(k == 1){
							op3 = "-";
						}
						System.out.println(a + op1 + b + op2 + c + op3 + d + "=7");
						return;
					}
				}
			}
		}
	}
}