import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt(), ret = 0;
			if(a == 0) break;
			for(int i = 1; i < a; i++) {
				if(i == 2) ret += 29;
				else if(i == 4 || i == 6 || i == 9 || i == 11) ret += 30;
				else ret += 31;
			}
			ret = (ret + b) % 7;
			if(ret == 0) System.out.println("Wednesday");
			if(ret == 1) System.out.println("Thursday");
			if(ret == 2) System.out.println("Friday");
			if(ret == 3) System.out.println("Saturday");
			if(ret == 4) System.out.println("Sunday");
			if(ret == 5) System.out.println("Monday");
			if(ret == 6) System.out.println("Tuesday");
		}
	}
}