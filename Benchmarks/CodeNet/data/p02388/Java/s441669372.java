import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.println(Cube(x));
	}

	public static int Cube(int x){
		int ans = 1;
		for(int i = 0; i < 3; i++){
			ans *= x;
		}
		return ans;
	}
}