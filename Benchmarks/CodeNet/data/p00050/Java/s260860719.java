import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder ans = new StringBuilder();
		while(in.hasNext()) {
			String wd = in.next();
			ans.append(wd.contains("apple")?"peach":wd.contains("peach")?"apple":wd).append(" ");
		}
		System.out.println(ans.toString().trim()+".");
	}
}