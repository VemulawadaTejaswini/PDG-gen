import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);
			
			if(n == 0 && m == 0){
				break;
			}
			
			int r = Integer.parseInt(br.readLine());
			
			Record[] records = new Record[r];
			
			for(int i = 0; i < r; i++){
				records[i] = new Record(br.readLine());
			}
			
			int q = Integer.parseInt(br.readLine());
			
			Query[] queries = new Query[q];
			
			for(int i = 0; i < q; i++){
				queries[i] = new Query(br.readLine());
			}
			
			solve(records, queries, n, m);
		}
	}
	
	static void solve(Record[] records, Query[] queries, int n, int m){
		final int timeOffset = 540;
		
		Arrays.sort(records);
		//debug
//		for(int i = 0; i < records.length ; i++){
//			System.out.println(records[i].toString());
//		}
		for(int i = 0; i < queries.length; i++){
			//該当するユーザのものを探す
			int index = -1;
			for(int j = 0; j < records.length ; j++){
				if(records[j].stdNum == queries[i].stdNum){
					index = j;
//					System.out.println("start from record "+index);
					break;
				}
			}
			
			//全くPCを利用しなかった場合
			if(index < 0){
				System.out.println(0);
				continue;
			}
			
			boolean used[] = new boolean[1261 - timeOffset];
			for(int j = index; j < records.length && records[j].stdNum == queries[i].stdNum ; j+=2){
				Record recordS = records[j];
				Record recordE = records[j + 1];
				int loginTime = recordS.time - timeOffset;
				int logoutTime = recordE.time - timeOffset;
				
//				System.out.println("login "+loginTime+" logout "+logoutTime);
				for(int k = loginTime ; k < logoutTime ; k++){
					used[k] = true;
				}
			}
			
			int usingTime = 0;
			for(int j = queries[i].start - timeOffset ; j < queries[i].end - timeOffset ; j++){
				if(used[j]){
					usingTime++;
				}
			}
			System.out.println(usingTime);
		}
	}

}

class Record implements Comparable<Record>{
	int time;
	int pcNum;
	int stdNum;
	boolean status;
	static final boolean IN = true;
	static final boolean OUT = false;
	public Record (String str){
		String[] tmpArray = str.split(" ");
		time = Integer.parseInt(tmpArray[0]);
		pcNum = Integer.parseInt(tmpArray[1]);
		stdNum = Integer.parseInt(tmpArray[2]);
		
		if(tmpArray[3].equals("0")){
			status = OUT;
		}
		else {
			status = IN;
		}
	}
	@Override
	//学籍、PC番号、時間の順で並べる
	public int compareTo(Record r) {
		return this.stdNum == r.stdNum ?
				(this.pcNum == r.pcNum ? 
						(this.time - r.time) : this.pcNum - r.pcNum) : this.stdNum - r.stdNum;
	}
	
	public String toString(){
		return "time "+time+" pcnum "+pcNum+" stdNum "+stdNum+" login? "+status;
	}
}

class Query {
	int start;
	int end;
	int stdNum;
	
	public Query (String str){
		String[] tmpArray = str.split(" ");
		
		start = Integer.parseInt(tmpArray[0]);
		end = Integer.parseInt(tmpArray[1]);
		stdNum = Integer.parseInt(tmpArray[2]);
	}
}
