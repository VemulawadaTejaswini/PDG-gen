public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int cap = a - b;
		if(cap>= c) {
			System.out.println(0);
		}else {
			System.out.println(c-cap);
		}
	}
}
