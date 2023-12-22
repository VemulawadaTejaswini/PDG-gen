import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int h = sc.nextInt();
	int w = sc.nextInt();
	String[] a = new String[h];
	for(int i = 0; i < h; i++) {
		a[i] = sc.next();
	}
	for(int i = 0; i <= w; i++) {
		System.out.print("#");
	}
	System.out.println("#");
	for(int i = 0; i < h; i++) {
		System.out.print("#");
		System.out.print(a[i]);
		System.out.println("#");
	}
	for(int i = 0; i <= w; i++) {
		System.out.print("#");
	}
	System.out.println("#");
}
}
