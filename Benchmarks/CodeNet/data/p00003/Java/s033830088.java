public class Main {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int count = scan.nextInt();
		while (0 < count--) {
			long[] l = {scan.nextLong(), scan.nextLong(), scan.nextLong()};
			java.util.Arrays.sort(l);
			print(l[0] * l[0] + l[1] * l[1] == l[2] * l[2] ? "YES" : "NO");
		}
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}