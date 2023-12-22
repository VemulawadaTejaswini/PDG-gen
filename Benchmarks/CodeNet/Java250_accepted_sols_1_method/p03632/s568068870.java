import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	if(a >= c) {
		if(a >= d) {
			System.out.println(0);
		} else if(a <= d && b >= d) {
			System.out.println(d - a);
		} else if(b <= d) {
			System.out.println(b - a);
		}
	} else {
		if(c >= b) {
			System.out.println(0);
		} else if(c <= b && b <= d) {
			System.out.println(b- c);
		} else if(b >= d) {
			System.out.println(d - c);
		}
	}
}
}
