import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int yes=0, no=0;
		int[] ball = new int[10];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++) {
				ball[i] = sc.nextInt();
			}
			for (int j = 0; j < ball.length; j++) {
				if(ball[j] < ball[j]+2){
					yes++;
				}else{
					no++;
				}
			}
			if(yes > no) System.out.println("YES");
			else if(yes < no) System.out.println("NO");
		}
	}
}