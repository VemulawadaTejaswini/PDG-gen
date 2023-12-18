import java.util.*;

public class Main {
	ArrayList<ArrayList<Integer>> pass;
	int ans;
	
	private void dfs(ArrayList<Integer> cards){
		ans = Math.min(ans, cards.size());
		if(ans == 0) return;
		boolean [][] used = new boolean[20][20];
		for(int i=0; i < cards.size();i++){
			for(int j = 0; j < pass.get(i).size();j++){
				int ind = pass.get(i).get(j);
				if(used[i][ind]) continue;
				used[i][ind] = true;
				used[ind][i] = true;
				if(ind >= cards.size()) continue;
				int ind2;
				if(ind < i){
					ind2 = i;
				}
				else{
					ind2 = ind;
					ind = i;
				}
				int cand1 = cards.get(ind) , cand2 = cards.get(ind2);
				if(cand1 != cand2) continue;
				ArrayList<Integer> next = new ArrayList<Integer>();
				next.addAll(cards);
				next.remove(ind2);
				next.remove(ind);
				dfs(next);
				next.add(ind, cand1);
				next.add(ind2, cand2);
				
			}
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pass = new ArrayList<ArrayList<Integer>>();
		passCreate();
		while(n-- > 0){
			ans = 20;
			ArrayList<Integer>cards = new ArrayList<Integer>();
			for(int i=0; i < 20; i++){
				cards.add(sc.nextInt());
			}
			dfs(cards);
			System.out.println(ans);
		}
	}
	
	private void passCreate(){
		for(int i=0; i < 20; i++){
			ArrayList<Integer> now = new ArrayList<Integer>();
			if((i - 4) >= 0){
				if(i% 4 != 0){
					now.add(i-5);
				}
				now.add(i-4);
				if((i + 1) % 4 != 0){
					now.add(i-3);
				}
			}
			if(i% 4 != 0){
				now.add(i-1);
			}
			if((i + 1) % 4 != 0){
				now.add(i+1);
			}
			if(i + 4 < 20){
				if(i% 4 != 0){
					now.add(i+3);
				}
				now.add(i+4);
				if((i + 1) % 4 != 0){
					now.add(i+5);
				}
			}
			pass.add(now);
		}
//		for(int i=0; i < pass.size(); i++){
//			System.out.println("i= " + i);
//			System.out.println(pass.get(i).toString());
//		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}