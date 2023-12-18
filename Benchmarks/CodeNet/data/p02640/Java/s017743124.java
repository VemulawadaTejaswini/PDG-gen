public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		double a = (4*X -Y)/2;
		if(a >= 0 && a == (int)a) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");;
		}
	}
}
