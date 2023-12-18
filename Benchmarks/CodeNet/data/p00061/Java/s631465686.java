/**
 * 
 */
import java.util.*;
/**
 * @author akira
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		ArrayList<pair> al = new ArrayList<pair>();
		while(true){
			String str = scan.next();
			int x = Integer.parseInt(str.substring(0,str.indexOf(",")));
			str = str.substring(str.indexOf(",") + 1,str.length());
			int y = Integer.parseInt(str);
			if(x == 0 && y == 0){
				break;
			}
			pair p = new pair(x,y);
			al.add(p);
		}
		Collections.sort(al,new PairCompare());
		for(int i = 0;i < al.size();i++){
			System.out.println("" + al.get(i).first + " " + al.get(i).second);
		}
		while(scan.hasNextInt()){
			int n = scan.nextInt();
			int rank = 1;
			for(int i = 0;i < al.size();i++){
				if(i != 0 && al.get(i - 1).second != al.get(i).second){
					rank++;
				}
				if(al.get(i).first == n){
					System.out.println("" + rank);	
				}
			}
		}
		
	}

}
class pair{
	int first;
	int second;
	pair(int x,int y){
		first = x;
		second = y;
	}
}
class PairCompare implements Comparator<pair>{

	public int compare(pair x,pair y) {
		// TODO 自動生成されたコンストラクター・スタブ
		if(x.second > y.second){
			return -1;
		}else if(x.second < y.second){
			return 1;
		}else{
			if(x.first < y.first){
				return -1;
			}else{
				return 1;
			}
		}
		
	}
}