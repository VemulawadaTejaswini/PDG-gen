
import java.util.Scanner;
 class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int yoko = sc.nextInt(), tate = sc.nextInt();
		int x = sc.nextInt(), y = sc.nextInt(),r = sc.nextInt();
		if(x+r <= yoko && x-r >= 0){
			if(y+r <= tate && y-r >= 0){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}
 }
 