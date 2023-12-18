public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		var x = sc.nextInt();
		var t = sc.nextInt();
		var cost = 0;

		for(var mk=0;mk<n;) {
			mk+=x;
			cost+=t;
		}
		System.out.println(cost);

	}
}
