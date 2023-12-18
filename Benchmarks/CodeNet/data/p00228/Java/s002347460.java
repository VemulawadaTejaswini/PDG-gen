import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	String [] digit = {"0111111","0000110","1011011","1001111","1100110",
			"1101101","1111101", "0100111","1111111","1101111"};
	
	private void doit() {
		while (true) {
			int n = sc.nextInt();
			if(n == -1) break;
			StringBuilder nowstate = new StringBuilder("0000000");
			while(n-- > 0){
				int num = sc.nextInt();
				String numstr = digit[num];
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < numstr.length(); i++){
					if(numstr.charAt(i) == nowstate.charAt(i)){
						sb.append(0);
					}
					else{
						sb.append(1);
					}
				}
				System.out.println(sb.toString());
				nowstate = new StringBuilder(numstr);
			}
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}