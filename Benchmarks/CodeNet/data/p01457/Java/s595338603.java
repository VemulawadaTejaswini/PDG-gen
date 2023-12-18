import java.util.*;

public class Main{
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int dataset = sc.nextInt();
			long left = 0, right = 0;
			while(dataset-- > 0){
				int pos = sc.nextInt();
				char c = sc.next().charAt(0);
				int time = sc.nextInt();
				if(c == '('){
					left += time;
				}
				else{
					right += time;
				}
				if(left == right){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
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