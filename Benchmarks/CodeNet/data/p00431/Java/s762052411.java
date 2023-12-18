import java.util.*;

public class Main {
	int[][] a;
	int len, n;
	LinkedList<Integer> stack;
	
	void loop(){
		len = Math.max(len, stack.size());
		int pre = stack.getFirst();
		for(int i=0;i<n;i++){
			if(a[i][0]==pre && stack.contains(a[i][1])==false){
				stack.push(a[i][1]);
				loop();
				stack.pop();
			}
			if(a[i][1]==pre && stack.contains(a[i][0])==false){
				stack.push(a[i][0]);
				loop();
				stack.pop();
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			a = new int[n][2];
			for(int i=0;i<n;i++){
				a[i][0] = sc.nextInt();
				a[i][1] = sc.nextInt();
			}
			
			ArrayList<Integer> memo = new ArrayList<Integer>();
			stack = new LinkedList<Integer>();
			len = 0;
			for(int i=0;i<n;i++){
				for(int j=0;j<2;j++){
					if(memo.contains(a[i][j])==false){
						memo.add(a[i][j]);
						stack.push(a[i][j]);
						loop();
						stack.pop();
					}
				}
			}
			System.out.println(len);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}	
}