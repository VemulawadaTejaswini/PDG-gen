import java.util.Scanner;

public class  Main{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
			int a = src.nextInt();
			int b = src.nextInt();
			int c = src.nextInt();

			if((a <= b) && (b <= c)) {
				System.out.println(String.format("%d %d %d",a ,b ,c));
			}else if((a <= c) && (c <= b)) {
				System.out.println(String.format("%d %d %d",a ,c ,b));
			}else if((b <= a) && (a <= c)) {
				System.out.println(String.format("%d %d %d",b ,a ,c));
			}else if((b <= c) && (c <= a)) {
				System.out.println(String.format("%d %d %d",b ,c ,a));
			}else if((c <= b) && (b <= a)) {
				System.out.println(String.format("%d %d %d",c ,b ,a));
			}else if((c <= a) && (a <= b)) {
				System.out.println(String.format("%d %d %d",c ,a ,b));
	}
	}
}

