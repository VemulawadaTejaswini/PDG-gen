import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ary[], t, i;
		int w = sc.nextInt();
		ary = new int[w + 1];
		for(i = 0; i < w; i++)
			ary[i + 1] = i + 1;
		int n = sc.nextInt();
		for(i = 0; i < n; i++){
			String[] s = sc.next().split(",", 0);
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			t = ary[a];
			ary[a] = ary[b];
			ary[b] = t;
		}
		for(i = 0; i < w; i++)
			System.out.println(ary[i + 1]);
	}
}