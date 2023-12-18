import java.util.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int count = 0;
			boolean flg = true;
			for(int i = 0; i < n; i++){
				String s = sc.next();
				int num = sc.nextInt();
				if(s.charAt(0) == '('){
					count += num;
				}
				else{
					count -= num;
					if(count < 0){
						flg = false;
					}
				}
			}
			if(flg && count == 0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
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