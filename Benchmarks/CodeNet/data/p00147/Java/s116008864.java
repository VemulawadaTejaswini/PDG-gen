
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * No 147
 * Time: 2h
 * Result : OK
 *
 */
public class Main {

	/** Group */
	private static class Group {
		/** group number */
		int i;
		
		int arriveTime;
		/** number of person */
		int person;
		
		/** Time to finish eating */
		int period;
		
		public Group(int i) {
			this.i = i;
			this.arriveTime = i * 5;
			this.person = i%5 == 1 ? 5 : 2;
			this.period = 17*(i % 2) + 3*(i % 3) + 19;
		}
		
		int eatStart = -1;
		public void setEatStart(int time) {
			this.eatStart = time;
		}
		public int waitingTime() {
			return eatStart - arriveTime;
		}
	}
	
	private static class Table {
		// this value is time to finish eating;
		private int[] table = new int[17];
		
		public void forwardTime(){
			for (int i = 0; i < table.length;i++) {
				if (table[i] > 0) {
					table[i] -= 1;
				}
			}
		}
		
		public boolean welcomeGroupIfavailable(Group g) {
			TreeMap<Integer, Integer> available = new TreeMap<Integer, Integer>();
			int hit=-1;
			// find continue 0;
			for (int i = 0; i < table.length;i++) {
				int t = table[i];
				
				if (t == 0){ // tabale is availabel
					if (hit < 0) {
						hit = i;
						available.put(hit, 1);
					} else {
						available.put(hit, available.get(hit)+1);
					}
				}else {
					hit = -1;
				}
			}
			for(Map.Entry<Integer, Integer> e : available.entrySet()) {
				if(e.getValue() >= g.person) { // table is available for group;
					for (int i = 0; i < g.person; i++) {
						table[i + e.getKey()] = g.period;
					}
					return true;
				}
			}
			return false;
		}
		public void dump(int time) {

			System.out.print(time + ":");
			for (int i :table) {
				System.out.print(i > 0 ? i+"" : "_");
				System.out.print(",");
			}
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) {
		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < 100; i++) {
			groups.add(new Group(i));
		}

		Table table = new Table();

		// start time loop
		LinkedList<Group> q = new LinkedList<Group>(); // waiting queue;
		int groupCount = 0;
		for (int time = 0; ; time++){
			// arrive next group
			
			Group next = groups.get(groupCount >= groups.size() ? groups.size()-1 : groupCount);
			if (time == next.arriveTime) {
				q.add(next);
				groupCount++;
			}
			
			// change table state;
			table.forwardTime();
			
			// welcome from q, if table is available
			while(!q.isEmpty()) {
				Group g = q.peek();
				if (table.welcomeGroupIfavailable(g)) {
					g.setEatStart(time);
					//System.out.println(g.i + ";" + g.arriveTime + "<" + g.eatStart + ":" +g.person);
					q.poll(); // remove from queue;
				} else {
					break; // not exit;
				}
			}
			//table.dump(time);
			// end if final group start eating;
			if (groupCount >= groups.size() && next.eatStart >= 0) {
				break;
			}
		}
		// calc is end. reading stdio. then	 answer;
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()) {
			System.out.println(groups.get(s.nextInt()).waitingTime());
		}
		s.close();
		
	}

}