public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var s = sc.next();
		var t = sc.next();
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}