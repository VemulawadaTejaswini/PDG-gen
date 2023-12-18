import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
		System.out.println(min(a,b,c)+" "+max(a,b,c));
		
	}
	public static int max(int... ar) {Arrays.sort(ar);return ar[ar.length-1];}
	public static int min(int... ar) {Arrays.sort(ar);return ar[0];}
}
