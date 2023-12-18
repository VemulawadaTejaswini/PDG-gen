import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int w = scn.nextInt(), n = scn.nextInt();
		int[] ans = new int[w];
		for(int i = 1;i <= w;i++) {
			ans[i-1] = i;
		}
		int a,b,buf;
		String line = scn.nextLine();
		for(int i = 0;i < n;i++) {
			line = scn.nextLine();
			String[] nyan = line.split(",");
			a = Integer.parseInt(nyan[0])-1;
			b = Integer.parseInt(nyan[1])-1;
			buf = ans[a];
			ans[a] = ans[b];
			ans[b] = buf;
		}
		for(int i = 0;i < w;i++) {
			System.out.println(ans[i]);
		}
		scn.close();
	}
}
