import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			int [] score = new int[2];
			for(int i = 0; i < n; i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(a > b){
					score[0] += a + b;
				}
				else if(b > a){
					score[1] += a + b;
				}
				else{
					score[0] += a;
					score[1] += b;
				}
			}
			System.out.println(score[0] + " " + score[1]);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}