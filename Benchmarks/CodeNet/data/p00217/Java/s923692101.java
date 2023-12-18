import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);

	private void doit(){
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int max = 0;
			int id = 0;
			for(int i = 0; i < n; i++){
				int a = sc.nextInt();
				int b = sc.nextInt() + sc.nextInt();
				if(max < b){
					max = b;
					id = a;
				}
			}
			System.out.println(id + " " + max);
		}
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}