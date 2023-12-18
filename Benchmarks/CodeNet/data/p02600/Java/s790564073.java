import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int g = 1;
		int x = 1800;
		while ( a<x ) {
			g++;
			x -= 200;
		}

		System.out.println(g);
	}
}