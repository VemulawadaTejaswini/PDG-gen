import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		if ((x-r)<0){
			System.out.println("No");
		} else if ((y-r)<0){
			System.out.println("No");
		} else if (w<(x+r)){
			System.out.println("No");
		} else if (h<(y+r)){
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}