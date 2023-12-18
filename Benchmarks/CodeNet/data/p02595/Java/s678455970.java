public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		var d = sc.nextLong();
		var cnt = 0;
		for(int i=0;i<n;i++) {
			var p = sc.nextLong();
			var q = sc.nextLong();
			if(Math.sqrt(p*p+q*q)<=d) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
