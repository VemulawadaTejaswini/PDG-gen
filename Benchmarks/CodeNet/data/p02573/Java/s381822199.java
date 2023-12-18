import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] aArray = new int[m];
			int[] bArray = new int[m];
			
			for(int i = 0 ; i < m ; i++ ) {
				aArray[i] = sc.nextInt();
				bArray[i] = sc.nextInt();
			}
			
			//最大の友達グループのサイズを求めることと同じ
			int[] gArray = new int[n+1];
			int[] counts = new int[n+1];
			Map<Integer, Integer> dupMap = new HashMap<>(); 
		
			int gid = 1;
			for(int i = 0 ; i < m ; i++ ) {
				int cgid = gid;
				if (gArray[aArray[i]] > 0 ) {
					cgid = rootGid(dupMap, cgid);
					
					if ( gArray[bArray[i]] > 0 ) {
		
						int g2 = rootGid(dupMap, gArray[bArray[i]]);
						
						if (cgid == g2) {
							//do nothing
						}
						else {
							//merge pair
							if ( cgid < g2) {
								dupMap.put(g2, cgid);
							}
							else {
								dupMap.put(cgid, g2);
							}
							int temp = counts[cgid];
							counts[cgid] = counts[g2];
							counts[g2] += temp;
						}
					}
					else {
						gArray[bArray[i]] = cgid;
						counts[cgid] += 1;
						// should merged
					}
				}
				else if ( gArray[bArray[i]] > 0 ) {
					cgid = rootGid(dupMap, gArray[bArray[i]]);
					gArray[aArray[i]] = cgid;
					counts[cgid] += 1;
					// should merged
				}
				else {
					dupMap.put(cgid, cgid);
					gArray[aArray[i]] = cgid;
					gArray[bArray[i]] = cgid;
					counts[cgid] += 2;
					gid++;
				}
			}
			
			int max = 0;
			for(int i = 0 ; i < gid ; i++ ) {
				if ( counts[i] > max ) {
					max = counts[i];
				}
			}
			
			System.out.println(max);
			
		}
	}

	public static int rootGid(Map<Integer, Integer> dupMap, int gid) {
		if ( !dupMap.containsKey(gid) ) {
			dupMap.put(gid, gid);
			return gid;
		}
		else {
			int pgid = gid;
			while( true ) {
				if ( dupMap.get(pgid) == pgid) {
					return pgid;
				}
				else {
					pgid = dupMap.get(pgid);
				}
			}
		}
	}
}