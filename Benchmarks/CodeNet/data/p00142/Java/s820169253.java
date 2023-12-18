import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			/* ツ妥ヲツ暗ェツ段ツ階ツづ個計ツ算 */
			HashSet<Integer> first = new HashSet<Integer>();
			for(int i=1;i<n;i++){
				first.add(i*i%n);
			}

			/* ツ妥ヲツ禿ア,ツ三ツ段ツ階ツづ個計ツ算 */
			int max = (n-1) / 2;
			int[] count = new int[max+1];
			for(int x : first){
				for(int y : first){
					if(x == y) continue;

					int diff = x - y;
					if(diff <= 0) diff += n;
					if(diff > max) diff = n - diff;
					count[diff]++;
				}
			}
			
			for(int i=1;i<=max;i++){
				System.out.println(count[i]);
			}
		}
	}
}