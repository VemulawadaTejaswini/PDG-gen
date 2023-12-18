import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder ans = new StringBuilder();
		while(in.hasNext()) {
			String x = in.next();
			if(x.contains("apple"))
				ans.append(x.replace("apple","peach")).append(" ");
			else if(x.contains("peach"))
				ans.append(x.replace("peach","apple")).append(" ");
			else
				ans.append(x).append(" ");
		}
		System.out.println(ans.toString().trim());
	}
}