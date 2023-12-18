import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[m];
		int[] w = new int[m];
		Map<Integer,Integer> maph = new HashMap<>();
		Map<Integer,Integer> mapw = new HashMap<>();
		boolean[][] map = new boolean[H][W];
		for(int i = 0; i < m; i++) {
			h[i] = sc.nextInt();
			w[i] = sc.nextInt();
			if(maph.get(h[i]) == null) maph.put(h[i], 1);
			else maph.put(h[i], maph.get(h[i]) + 1);
			if(mapw.get(w[i]) == null) mapw.put(w[i], 1);
			else mapw.put(w[i], mapw.get(w[i]) + 1);
			map[h[i]-1][w[i]-1]=true;
		}
		int maxKeyh = 0;
		int maxValueh = 0;
		for (Map.Entry<Integer, Integer> entry : maph.entrySet()) {
			  if (entry.getValue() > maxValueh) {
			    maxKeyh = entry.getKey();
			    maxValueh = entry.getValue();
			  }
			}
		int maxKeyw = 0;
		int maxValuew = 0;
		for (Map.Entry<Integer, Integer> entry : mapw.entrySet()) {
			  if (entry.getValue() > maxValuew) {
			    maxKeyw = entry.getKey();
			    maxValuew = entry.getValue();
			  }
			}
		long ans = 0;
		if(maxValueh>=maxValuew) {
			for(int i = 0; i < m; i++) {
				long memo=maxValueh;
				memo+=mapw.get(w[i]);
				if(map[maxKeyh-1][w[i]-1])memo--;
				if(memo>ans)ans=memo;
			}
		}
		else {
			for(int i = 0; i < m; i++) {
				long memo=maxValuew;
				memo+=maph.get(h[i]);
				if(map[h[i]-1][maxKeyw-1])memo--;
				if(memo>ans)ans=memo;
			}
		}
		System.out.println(ans);
	}
}