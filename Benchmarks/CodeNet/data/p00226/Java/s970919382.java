import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	private void doit() {
		while (true) {
			String a = sc.next();
			String b = sc.next();
			if(a.equals("0") && b.equals("0")) break;
			char [] c = (a + "").toCharArray();
			char [] d = (b + "").toCharArray();
			int hit = 0, blow = 0;
			boolean [] used = new boolean[c.length];
			for(int i = 0; i < c.length; i++){
				if(c[i] == d[i]){
					hit++;
					used[i] = true;
				}
			}
			
			for(int i = 0; i < c.length; i++){
				if(used[i]) continue;
				for(int j = 0; j < c.length; j++){
					if(i == j)continue;
					if(c[i] == d[j]){
						blow++;
						break;
					}
				}
			}
			System.out.println(hit + " " + blow);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}