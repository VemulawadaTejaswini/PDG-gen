import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int width= scanner.nextInt();
		int height = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
		
		String ans = "Yes";
		if(x+r > width || x-r < 0 || y+r > height || y-r < 0)
			ans="No";
		
		System.out.println(ans);
		scanner.close();
	}
}