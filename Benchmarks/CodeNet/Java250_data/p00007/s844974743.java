import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> ans = new ArrayDeque<Integer>();

		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = 100000;
			for(int j=0;j<n;j++){
				m *= 1.05;
				double s = (double)m/1000;
				int t = m/1000;
				if(s!=t)m=(t+1)*1000;
			}
			ans.push(m);
		}
		int num = ans.size();
		for(int i=0;i<num;i++){
			System.out.println(ans.pollLast());
		}
	}
}