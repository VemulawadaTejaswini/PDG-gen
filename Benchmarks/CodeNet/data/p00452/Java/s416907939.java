
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			int[] p = new int[n+1];
			for(int i=0;i<n;i++){
				p[i] = sc.nextInt();
			}
			p[n++] = 0; //0ツ点ツづ個スツコツアツづーツ催ャツづゥ

			ArrayList<Integer> sum = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					sum.add(p[i]+p[j]);
				}
			}
			Collections.sort(sum);

			int ans = 0;

			for(int i=0;i<sum.size();i++){
				int rem = m - sum.get(i);
				if(rem < 0) continue;
				int left = 0, right = sum.size();

				while(left < right){
					int center = (left + right) / 2;
					if(rem > sum.get(center)){
						left = center + 1;
					}
					else if(rem < sum.get(center)){
						right = center;
					}
					else {
						break;
					}
				}

				ans = Math.max(ans,sum.get(i) + sum.get(right-1));
			}

			System.out.println(ans);
		}
	}
}