import java.util.Scanner;
public class Main {
	
	static char[] k = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int w = stdIn.nextInt();
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			String tmp = stdIn.next();
			a[i] = Integer.parseInt(Character.toString(tmp.charAt(0)));
			b[i] = Integer.parseInt(Character.toString(tmp.charAt(2)));
		}
		int[] loc = new int[w];
		for(int i = 0; i < w; i++) {
			int p = i+1;
			for(int j = 0; j < n; j++) {
				if(a[j] == p) {
					p = b[j];
				}
				else if(b[j] == p) {
					p = a[j];
				}
			}
			loc[p-1] = i+1;
		}
		
		for(int i = 0; i < w; i++) {
			System.out.println(loc[i]);
		}
	}
}