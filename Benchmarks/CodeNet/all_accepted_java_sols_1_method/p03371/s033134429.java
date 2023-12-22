import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		sc.close();
 
		int cost = Integer.MAX_VALUE;
		//全探索
		for(int i = 0; i <= Math.pow(10, 5); i++) {
			int tmpCost = i * 2 * C + Math.max(0, X - i) * A + Math.max(0, Y - i) * B;
			if(tmpCost < cost) cost = tmpCost;
		}
 
		System.out.println(cost);
	}
 
}