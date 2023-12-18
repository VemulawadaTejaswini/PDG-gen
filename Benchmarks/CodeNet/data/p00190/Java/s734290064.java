import java.util.*;
import java.util.regex.Pattern;
public class Main {
	
	ArrayList<ArrayList<Integer>> swapList;
	int ans;
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
		swapList = createSwapList();
		
		//from ans
		String goal = "0 1 2 3 4 5 6 7 8 9 10 11 0";
		HashMap<String, Integer> fromAns = createStep(goal,new HashMap<String,Integer>());
		
		
		while(true){
			//input data
			int n = sc.nextInt();
			if(n == -1) break;
			//create start String
			StringBuilder sb  = new StringBuilder(""+n);
			for(int i=1; i <= 12; i++){
				sb.append(" " + sc.next());
			}
			String startS = sb.toString();
			
			if(fromAns.containsKey(startS)){
				System.out.println(fromAns.get(startS));
				continue;
			}
			
			//from start
			ans = -1;
			HashMap<String, Integer> fromStart = createStep(startS,fromAns);
			
			//comp and out
			if(ans != -1){
				System.out.println(ans);
			}
			else{
				System.out.println("NA");
			}
		}
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
			sb.append(s[i] + " ");
		}
		sb.append(s[s.length-1]);
		return sb.toString();
	}
	
	private HashMap<String,Integer> createStep(String start, HashMap<String, Integer> another){
		//init
		LinkedList<C> open = new LinkedList<C>();
		open.add(new C(start, 0));
		HashMap<String , Integer> close = new HashMap<String, Integer>();
		if(another.containsKey(start)){
			close.put(start, another.get(start));
		}
		else{
			close.put(start, 0);
		}
		
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
					if(another.containsKey(newS)){
						ans = nextstep + another.get(newS);
						return close;
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
		return close;
	}

	private ArrayList<ArrayList<Integer>> createSwapList() {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i <= 12; i++){
			res.add(new ArrayList<Integer>());
			//bottom
			if(! (i == 4 || i == 9 || i == 12 || i == 11 || i == 8 || i == 10)){
				res.get(i).add(i+4);
			}
			//right
			if(! (i == 0 || i == 3 || i == 8 || i == 11 || i == 12)){
				res.get(i).add(i+1);
			}
			//left
			if(! (i == 0 || i == 1 || i == 4 || i == 9 || i == 12)){
				res.get(i).add(i-1);
			}
			//top
			if(! (i == 4 || i == 1 || i == 0 || i == 3 || i == 8 || i == 2)){
				res.get(i).add(i -4);
			}
		}
		res.get(2).add(0);
		res.get(10).add(12);
		
		return res;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}