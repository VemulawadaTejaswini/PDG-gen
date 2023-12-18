public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(16368);
		for (int i = 0; i < 1000; i++) sb.append("Hello World\n");
		System.out.println(sb.toString());
	}
}