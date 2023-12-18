import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		List<String> divisor = new ArrayList<>();
//		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//		int x = Integer.parseInt(sc.next());
//		int S = Integer.parseInt(sc.next());
//		String[] S = sc.next().split("");
		String s = sc.next();
		String res = s.substring(s.indexOf("A"), s.lastIndexOf("Z") + 1);
		
//		for (int i = 1; i <= N; i++) {
//		}
		
		System.out.println(res.length());		
	}
}
