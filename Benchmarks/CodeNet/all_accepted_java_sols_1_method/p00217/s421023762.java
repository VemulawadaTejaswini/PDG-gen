import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		//それぞれの患者の番号 p
		//1回目に歩いた距離 d1
		//2回目に歩いた距離 d2

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();//患者の数 n
			int maxWalk = 0;//一番歩いた人の距離
			if(n==0){
				break;
			}
			Map<Integer, Integer> walkSum = new HashMap<Integer, Integer>();
			for(int i=0;i<n;i++){
				int p = sc.nextInt();
				int d1 = sc.nextInt();
				int d2 = sc.nextInt();
				int sumWalk = d1 + d2;
				if(sumWalk > maxWalk)maxWalk = sumWalk;
				walkSum.put(sumWalk,p);
			}
			System.out.println(walkSum.get((Object)maxWalk)+" "+maxWalk);
		}
	}
}