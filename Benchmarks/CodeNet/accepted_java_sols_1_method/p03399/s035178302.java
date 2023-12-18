import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int[] e = {a + c, a + d, b + c, b + d};
	int ans = 2000;
	for(int i = 0; i < 4; i++) {
		ans = Math.min(ans, e[i]);
	}
	System.out.println(ans);
}
}