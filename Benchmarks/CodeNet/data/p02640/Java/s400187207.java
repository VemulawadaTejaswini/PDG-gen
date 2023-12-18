import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if(X > 100 || Y > 100) {
			System.out.println("No");
		}
		for(int i = 0;i < X;i++) {
			if(2 * i == Y || 4 * i == Y) {
				System.out.println("Yes");
			}
		}
  }
}