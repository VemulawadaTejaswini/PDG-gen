import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x, y, z;
		int yn[] = new int[n];
		
		for(int i = 0; i < n; i++){
			x = scan.nextInt();
			y = scan.nextInt();
			z = scan.nextInt();
			if(x*x + y*y == z*z ||
			   x*x + z*z == y*y ||
			   y*y + z*z == x*x)yn[i] = 1;
		}
		for(int i = 0; i < n; i++){
			if(yn[i] == 1)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}