import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] a = new String[H];
		for(int i = 0;i < H;++i)
			a[i] = sc.next();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < W+2;++i)
			sb.append('#');
		sb.append('\n');
		for(int i = 0;i < H;++i) {
			sb.append('#');
			sb.append(a[i]);
			sb.append("#\n");
		}
		for(int i = 0;i < W+2;++i)
			sb.append('#');
		sb.append('\n');
		System.out.println(sb.toString());
	}
}
