
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 0){
			return;
		}
		String [][] stack = new String[n+1][1000];
		int [] pc = new int[n+1];
		while(true){
			String cmd = sc.next();
			if(cmd.equals("push")){
				int num = sc.nextInt();
				String block = sc.next();
				stack[num][pc[num]] = block;
				pc[num]++;
			}
			else if(cmd.equals("pop")){
				int num = sc.nextInt();
				if(pc[num] > 0){
					pc[num]--;
					System.out.println(stack[num][pc[num]]);
				}
			}
			else if(cmd.equals("move")){
				int from = sc.nextInt();
				int to = sc.nextInt();
				if(pc[from] > 0){
					stack[to][pc[to]] = stack[from][pc[from] - 1];
					pc[from]--;
					pc[to]++;
				}

			}
			else if(cmd.equals("quit")){
				break;
			}
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}