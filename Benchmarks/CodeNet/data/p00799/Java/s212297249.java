import java.util.*;
public class Main {
	int n,m, used;
	ArrayList<ArrayList<Integer>> lotateList;
	Guard [] gList;
	LinkedList<Integer> waitList;
	int ans;


	class Guard {
		int remain, ind;
		public Guard(int remain, int ind) {
			this.remain = remain;
			this.ind = ind;
		}
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			m = sc.nextInt();
			if((n|m) == 0)break;
			lotateList = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < n; i++){
				lotateList.add(new ArrayList<Integer>());
				int input = sc.nextInt();
				while(input != 0){
					lotateList.get(i).add(input);
					input = sc.nextInt();
				}
			}
			used = 0;
			gList = new Guard[n];
			for(int i = 0; i < n; i++){
				gList[i] = new Guard(lotateList.get(i).get(0), 0);
			}
			waitList = new LinkedList<Integer>();
			ans = 0;

			for(int i = 0; i < m-1; i++){
				decriment();
				inQueue();
				changeUsed();
				deQueue();
				ans += waitList.size();
			}
			System.out.println(ans);
		}
	}

	private void deQueue() {
		if(used == 0){
			if(waitList.size() > 0){
				int deqind = waitList.removeFirst();
				used = deqind + 1;
			}
		}

	}

	private void changeUsed() {
		if(used == 0) return;
		int i = used - 1;
		if(gList[i].remain == 0){
			used = 0;
			int lotateInd = (gList[i].ind + 1) % lotateList.get(i).size();
			int remainValue = lotateList.get(i).get(lotateInd);
			gList[i].remain = remainValue;
			gList[i].ind++;
		}

	}

	private void inQueue() {
		for(int i = 0; i < n; i++){
			if(gList[i].remain == 0 && gList[i].ind % 2 == 0){
				int lotateInd = (gList[i].ind + 1) % lotateList.get(i).size();
				int remainValue = lotateList.get(i).get(lotateInd);
				gList[i].remain = remainValue;
				gList[i].ind++;
				waitList.add(i);
			}
		}
	}

	private void decriment(){
		for(int j = 0; j < n; j++){
			if(gList[j].ind % 2 == 0){
				gList[j].remain--;
			}
		}
		if(used != 0){
			gList[used - 1].remain--;
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}