import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
                int y1length = y2-y1;
                int x1length = x2-x1;
                int x3 = x2 - y1length;
                int y3 = y2 + x1length;
                int x2length = x3 - x2;
                int y2length = y3 - y2;
                int x4 = x3 - y2length;
                int y4 = y3 + x2length;
		System.out.println(x3 +" "+y3+" "+x4 +" "+y4+" ");
		}
}