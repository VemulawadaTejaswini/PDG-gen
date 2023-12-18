import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> ans = new ArrayDeque<Integer>();
		ArrayDeque<Integer> sta = new ArrayDeque<Integer>();

		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0){
				ans.push(sta.pop());
			}else{
				sta.push(n);
			}
		}
		int num = ans.size();
		for(int i=0;i<num;i++){
			System.out.println(ans.pollLast());
		}
	}
}