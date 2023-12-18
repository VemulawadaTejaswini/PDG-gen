import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		stdin.nextLine();
		for (int i = 0; i < n; i++) {
			String train = stdin.nextLine();
			System.out.println(calculatePatterns(train));
		}
		System.exit(0);
	}
	public static int calculatePatterns(String train) {
		Set<String> patterns = new HashSet<String>();
		for (int i = 0; i < train.length() - 1; i++) {
			StringBuffer subtrainf = new StringBuffer(train.substring(0, i + 1));
			StringBuffer subtrainb = new StringBuffer(train.substring(i + 1, train.length()));

			patterns.add(subtrainf.toString() + subtrainb.toString());
			patterns.add(subtrainb.toString() + subtrainf.toString());
			subtrainf.reverse();
			patterns.add(subtrainf.toString() + subtrainb.toString());
			patterns.add(subtrainb.toString() + subtrainf.toString());
			subtrainb.reverse();
			patterns.add(subtrainf.toString() + subtrainb.toString());
			patterns.add(subtrainb.toString() + subtrainf.toString());
			subtrainf.reverse();
			patterns.add(subtrainf.toString() + subtrainb.toString());
			patterns.add(subtrainb.toString() + subtrainf.toString());
		}
		return patterns.size();
	}
}