import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> ans = new ArrayDeque<Integer>();

		while(sc.hasNext()){
			int n = sc.nextInt();
			int count=0;
			for(int i=0;i<(600/n);i++){
				count+=i*i*n*n*n;
			}
			ans.push(count);
		}
		int num = ans.size();
		for(int i=0;i<num;i++){
			System.out.println(ans.pollLast());
		}
	}
}