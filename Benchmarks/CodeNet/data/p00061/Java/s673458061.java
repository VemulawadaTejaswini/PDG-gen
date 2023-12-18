import java.util.*;

public class Main{
		
	public static void main(String[] args){
		Map<Integer, Team> num_team_map = new HashMap<Integer, Team>();
		List<Integer> ac_set = new ArrayList<Integer>();

		//input
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			Team t = new Team(str);
			if(t.number == 0 && t.accepted == 0) break;
			else{
				num_team_map.put(t.number, t);
				if(!ac_set.contains(t.accepted)) ac_set.add(t.accepted);
			}
		}
		
		//sort
		Collections.sort(ac_set, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2){
				if(o1 > o2) return -1; else if(o1 == o2) return 0; else return 1;
			}});
		
		//output
		while(sc.hasNextLine()) {
			int query = Integer.parseInt(sc.nextLine());
			System.out.println(rankOf(ac_set, num_team_map.get(query).accepted));
		}
		sc.close();
	}
	
	static int rankOf(List<Integer> aclist, int ac) {
		for(int i = 0; i < aclist.size(); i++) if(aclist.get(i) == ac) return i+1;
		return 0;
	}
}

class Team{
	int number;
	int accepted;

	Team(String str){
		Scanner sc = new Scanner(str);
		sc.useDelimiter(",");
		this.number = sc.nextInt();
		this.accepted = sc.nextInt();
		sc.close();
	}
}