public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int outlet = 1;
		int ans=0;
		while(outlet<b) {
			--outlet;
			outlet+=a;
			++ans;
		}
		System.out.println(ans);
	}
}