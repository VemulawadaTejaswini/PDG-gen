import java.util.*;
import java.util.regex.Pattern;
public class Main {
	
	ArrayList<ArrayList<Integer>> swapList;
	int ans;
	HashMap<String,Integer> fromAns;
	
	class C{
		int s;
		String now;
		public C(String now, int s){
			this.now = now;
			this.s = s;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		
		//swap pattern list
		createSwapList();
		
		//from ans
		String goal = "0 1 2 3 4 5 6 7 8 9 10 11 0";
		fromAns = new HashMap<String, Integer>();
		createStep(goal);
		
		while(true){
			//input data
			int n = sc.nextInt();
			if(n == -1) break;
			//create start String
			StringBuilder sb  = new StringBuilder(""+n);
			for(int i=1; i <= 12; i++){
				sb.append(" ");
				sb.append(sc.next());
			}
			String startS = sb.toString();
			
			if(fromAns.containsKey(startS)){
				System.out.println(fromAns.get(startS));
				continue;
			}
			
			//from start
			ans = -1;
			createStep(startS);
			
			//comp and out
			if(ans != -1){
				System.out.println(ans);
			}
			else{
				System.out.println("NA");
			}
		}
//		for(String key: fromAns.keySet()){
//			if(fromAns.get(key) == 10){
//				System.out.println(key);
//			}
//		}
	}
	
	private int getInd0F(String [] s) {
		int len = s.length;
		for(int i=0; i < len; i++){
			if(s[i].equals("0")) return i;
		}
		return -1;
	}
	
	private int getInd0L(String [] s) {
		int len = s.length;
		for(int i=len-1; i >= 0; i--){
			if(s[i].equals("0")) return i;
		}
		return -1;
	}
	
	private String createS(String [] s){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < s.length-1; i++){
			sb.append(s[i]);
			sb.append(" ");
		}
		sb.append(s[s.length-1]);
		return sb.toString();
	}
	
	private void createStep(String start){
		//init
		LinkedList<C> open = new LinkedList<C>();
		open.add(new C(start, 0));
		HashMap<String, Integer> close = new HashMap<String, Integer>();
		if(fromAns.containsKey(start)){
			ans = fromAns.get(start);
			return ;
		}
		close.put(start, 0);
		
		//start
		while(! open.isEmpty()){
			C now = open.removeFirst();
			
			//find a zero ind
			String [] nowParse = now.now.split(" ");
			int ind01 = getInd0F(nowParse);
			int ind02 = getInd0L(nowParse);
			int [] ind0list = {ind01, ind02};
			
			//swap pattern times
			for(int i = 0; i < ind0list.length;i++){
				int nowind = ind0list[i];
				for(int j=0; j < swapList.get(nowind).size(); j++){
					int swapind = swapList.get(nowind).get(j);
					String [] work = now.now.split(" ");
					
					//swap
					String temp = work[nowind];
					work[nowind] = work[swapind];
					work[swapind] = temp;
					
					//create new String 
					String newS = createS(work);
					
					//close contains
					if(close.containsKey(newS)) continue;
					
					//find a goal
					int nextstep = now.s + 1;
					if(fromAns.containsKey(newS)){
						ans = nextstep + fromAns.get(newS);
						return ;
					}
					
					//open.add
					if(now.s != 10){
						open.add(new C(newS, nextstep));
					}
					
					//close.put
					close.put(newS, nextstep);
				}
			}
		}
		fromAns = close;
	}

	private void createSwapList() {
		swapList = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i <= 12; i++){
			swapList.add(new ArrayList<Integer>());
		}
		for(int i=0; i <= 12; i++){
			//bottom
			if(i == 1 || i == 2 || i == 3 || i == 5 || i == 6 || i == 7){
				swapList.get(i).add(i+4);
				swapList.get(i+4).add(i);
			}
			if(i == 0 || i == 10){
				swapList.get(i).add(i+2);
				swapList.get(i+2).add(i);
			}
			//right
			if(i == 1 || i == 2 || i == 4 || i == 5 || i == 6 || i == 7 || i == 9 || i == 10 ){
				swapList.get(i).add(i+1);
				swapList.get(i+1).add(i);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}