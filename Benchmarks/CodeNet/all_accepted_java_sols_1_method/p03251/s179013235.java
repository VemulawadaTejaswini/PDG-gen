import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int [] xArray = new int [n];
		int [] yArray = new int [m];
		int xmax = -100;
		int ymin = 100;
		for(int i = 0; i < n; i++) {
			xArray[i] = sc.nextInt();
			if(xArray[i] > xmax) xmax = xArray[i];
		}
		for(int i = 0; i < m; i++) {
			yArray[i] = sc.nextInt();
			if(yArray[i] < ymin) ymin = yArray[i];
		}
		boolean judge = false;//合意不成立＝戦争
		for(int i = x+1; i <= y; i++) {//条件達成
			if(xmax < i && i <= ymin)judge = true;//合意成立＝No戦争
		}
		if(judge) System.out.println("No War");
		else System.out.println("War");
		
		sc.close();
	}
}
