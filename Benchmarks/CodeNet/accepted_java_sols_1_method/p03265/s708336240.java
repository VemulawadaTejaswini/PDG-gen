import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
        int y2 = sc.nextInt();
    
		int xGap = x2 - x1;
        int yGap = y2 - y1;
        StringBuilder builder = new StringBuilder();
        builder.append(x2 - yGap);
        builder.append(" ");
        builder.append(y2 + xGap);
        builder.append(" ");
        builder.append(x1 - yGap);
        builder.append(" ");
        builder.append(y1 + xGap);
    
		// 出力
		System.out.println(builder.toString());
	}
}