import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int dx = x2 - x1;
		int dy = y2 - y1;

		StringBuilder sb = new StringBuilder();
		sb.append(x2 - dy);
		sb.append(" ");
		sb.append(y2 + dx);
		sb.append(" ");
		sb.append(x1 - dy);
		sb.append(" ");
		sb.append(y1 + dx);
		System.out.println(sb.toString());
	}
}


