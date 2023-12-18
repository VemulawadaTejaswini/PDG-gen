import java.util.*;
public class Main {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)) {
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		double pi = 3.14;
		
		int m = w * h;
		double n = z * z * pi;
		
		
	if(x < w && y < h && 0 < x && 0 < y && 0 < z && z <= x && z <= y)
		if(n < m)
			System.out.println("Yes");
		else
			System.out.println("No");
	else
		System.out.println("No");
			
	}
}
}

