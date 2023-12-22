import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ballot = sc.nextInt();  //投票用紙の枚数
		TreeMap<String, Integer> voteMap = new TreeMap<>();
      int voteMax = 0;
 
		for(int i=1 ; i<=ballot ; i++) {
			int count;
			String voteName = sc.next();
 
			if(! voteMap.containsKey(voteName)) {
				count = 1;
				voteMap.put(voteName, count);
			}
			else {
				count = voteMap.get(voteName) + 1;
				voteMap.put(voteName, count);
			}
          
          voteMax = Math.max(voteMax, count);
		}
      
      for (Map.Entry<String, Integer> e : voteMap.entrySet()) {
        if (e.getValue() == voteMax) {
          System.out.println(e.getKey());
        }
      }
	}
}