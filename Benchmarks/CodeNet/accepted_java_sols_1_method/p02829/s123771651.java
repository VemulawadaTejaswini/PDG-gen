import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		if (a == 1) {
			if (b == 2) {
				result = 3;
			} else {
				result = 2;
			}
		} else if (a == 2) {
			if (b == 1) {
				result = 3;
			} else {
				result = 1;
			}
		} else {
			if (b == 1) {
				result = 2;
			} else {
				result = 1;
			}
		}
		System.out.println(result);
	}
}