import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0577().doIt();
	}

	class AOJ0577{
		void doIt() {
			int n = in.nextInt();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int[][] hyou = new int[n][3];
			for(int i=0;i<n;i++){
				hyou[i][0] = in.nextInt();
				hyou[i][1] = in.nextInt();
				hyou[i][2] = in.nextInt();
			}
			int[] result = new int[n];
			for(int i=0;i<3;i++){
				map = new HashMap<Integer, Integer>();
				for(int s=0;s<n;s++){
					if(!map.containsKey(hyou[s][i]))map.put(hyou[s][i], 0);
					map.put(hyou[s][i],map.get(hyou[s][i])+1);
				}
				for(int s=0;s<n;s++)if(map.get(hyou[s][i])==1)result[s]+=hyou[s][i];
			}
			for(int i=0;i<n;i++)System.out.println(result[i]);
		}

	}
}