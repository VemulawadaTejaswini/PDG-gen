import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);
	int [] table = {0,1,2,3,5,7,8,9};

	private void doit(){
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			String s = Integer.toOctalString(n);
			StringBuilder ans = new StringBuilder();
			for(int i = 0; i < s.length(); i++){
				int ind = s.charAt(i) - '0';
				ans.append(table[ind]);
			}
			System.out.println(ans.toString());
		}
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}