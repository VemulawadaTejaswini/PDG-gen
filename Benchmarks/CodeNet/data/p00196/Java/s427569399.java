
import java.util.*;

/* 19:08 ~  */
public class Main {
	static class Team{
		String name;
		int win , lose , other;
		public Team(String n , int[] result) {
			this.name = n;
			this.win = result[0];
			this.lose = result[1];
			this.other = result[2];
		}
	}
	static void sort( ArrayList<Team> list , int left , int right) {
		ArrayList<Team> copy = new ArrayList<Team>();

        if (left <= right) {
            Team p = list.get((left+right)/2);
            int l = left;
            int r = right;
            
            while(l <= r) {
                while(list.get(l).win < p.win){ l++; }
                while(list.get(r).win > p.win){ r--; }
                if (l <= r) {
                    Team tmp = list.get(l);
                    list.set(l,list.get(r));
                    list.set(r,tmp);
                    l++; 
                    r--;
                }
            }
    
            sort(list, left, r);
            sort(list, l, right);
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNext("0")) {
			ArrayList<Team> list = new ArrayList<Team>();
			int n = sc.nextInt();
			for ( int i = 0; i < n; i++ ) {
				String name = sc.next();
				int[] result = new int[3];
				for ( int j = 0; j < n - 1; j++ )
					result[sc.nextInt()]++;
				Team t = new Team(name,result);
				list.add(t);
			}
			sort(list,0,list.size()-1);
			Collections.reverse(list);
			for ( int i = 0; i < list.size(); i++ )
				System.out.println(list.get(i).name+" "+list.get(i).win+" "+list.get(i).lose+" "+list.get(i).other);
			System.out.println();
		}
	}
}