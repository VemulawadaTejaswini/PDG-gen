public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(
				java.util.stream.IntStream.rangeClosed(1, s.nextInt()).map(i -> s.nextInt()).distinct().count());
	}
}