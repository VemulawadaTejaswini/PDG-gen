public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] x = line.split(" ");

		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);

		System.out.println(a * b + " " + a * 2 + b * 2);

	}

}
