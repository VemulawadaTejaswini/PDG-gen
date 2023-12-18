import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		if(x > w){
			System.out.println("No");
		}
		else if(y > h){
			System.out.println("No");
		}
		else if(r > w){
			System.out.println("No");
		}
		else if(r > h){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
		
		sc.close();

	}

}