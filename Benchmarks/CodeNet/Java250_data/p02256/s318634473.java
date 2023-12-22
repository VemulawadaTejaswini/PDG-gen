import java.util.Scanner;

public class Main{
	public static int x;
	public static int y;
	public static int z;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y = sc.nextInt();
		if(x > y){
			solve(x,y);
		}
		else{
			solve(y,x);
		}
		System.out.println(z);

	}

	public static void solve(int big,int small){
		z = big % small;
		if (z == 0){
			z = small;
		}
		else{
			solve(small,z);
		}

	}

}