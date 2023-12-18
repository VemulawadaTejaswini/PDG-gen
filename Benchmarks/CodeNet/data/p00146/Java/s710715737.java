
import java.util.*;
public class Main {

	class C implements Comparable<C>{
		int dis,senryo;
		double time;
		ArrayList<Integer> list;

		public C(int dis, int senryo, ArrayList<Integer> list) {
			this.time = 0;
			this.dis = dis;
			this.senryo = senryo;
			this.list = list;
		}

		public C(int dis, int senryo,double time, ArrayList<Integer> list) {
			this.time = time;
			this.dis = dis;
			this.senryo = senryo;
			this.list = list;
		}

		@Override
		public String toString() {
			return "C [time=" + time + ", dis=" + dis + ", senryo=" + senryo
			           + ", list=" + list + "]";
		}

		public int compareTo(C a) {
			if(this.time <  a.time)
				return -1;
			if(this.time >  a.time)
				return 1;
			return 0;
		}
	}//C class end

	private double getCalc(int dis,int senryo){
		double ans = dis / (2000.0 / (70 + senryo * 20)) ;
		return ans;
	}

	private String ToStr(ArrayList<Integer> al){
		StringBuilder sb = new StringBuilder();
		for(int i =0; i < al.size() - 1; i++ ){
			sb.append(al.get(i) + " ");
		}
		sb.append(al.get(al.size() - 1));
		return sb.toString();
	}

	private void doIt() {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<C> open = new PriorityQueue<C>();
		int n = sc.nextInt();
		int [] numlist = new int[n];
		int [] dislist = new int[n];
		int [] senryolist = new int[n];
		for(int i=0; i < n; i++){
			int num = sc.nextInt();
			int dis = sc.nextInt();
			int senryo = sc.nextInt();
			numlist[i]= num;
			dislist[i] = dis;
			senryolist[i] = senryo;
			ArrayList<Integer> templist = new ArrayList<Integer>();
			templist.add(num);
			C temp = new C(dis, senryo, templist);
			open.add(temp);
		}

		C ans = null;
		while(! open.isEmpty()){
			C tempclass = open.poll();
			ArrayList<Integer> nowList = tempclass.list;

			if(nowList.size() == n){
				if(ans == null)
					ans = tempclass;
				else{
					if(ans.time > tempclass.time){
						ans = tempclass;
					}
				}
				break;
			}

			for(int i= 0; i < n; i++){
				if( ! nowList.contains(numlist[i])){
					ArrayList<Integer> nextList = new ArrayList<Integer>();
					nextList.addAll(nowList);
					nextList.add(numlist[i]);
					int dis = dislist[i];
					int senryo = tempclass.senryo + senryolist[i];
					double time = tempclass.time + getCalc(Math.abs(tempclass.dis - dislist[i]), tempclass.senryo);
					open.add(new C(dis, senryo,time, nextList));
				}
			}
		}
		System.out.println(ToStr(ans.list));
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}