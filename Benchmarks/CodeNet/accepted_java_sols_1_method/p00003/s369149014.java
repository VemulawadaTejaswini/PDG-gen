import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, a, b, c;
		int[] triangle = new int[3];
		for (i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			triangle[0] = a;
			triangle[1] = b;
			triangle[2] = c;
			Arrays.sort(triangle);
			if(triangle[2]*triangle[2] == triangle[1]*triangle[1] + triangle[0]*triangle[0]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}