import java.util.*;

public class Main {
	static int n, v, c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		
		String[] vs = sc.nextLine().split(" ");
		String[] cs = sc.nextLine().split(" ");
		
		v = 0;
		c = 0;
		//System.out.println(vs);
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(vs[i]) - Integer.parseInt(cs[i]) > 0) {
				v+=Integer.parseInt(vs[i]);
				c+=Integer.parseInt(cs[i]);
			}
		}
		//System.out.println(vs);
		System.out.println(v-c);
	}
}
