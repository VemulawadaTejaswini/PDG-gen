import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			if(n==0)break;
			List<team> t = new ArrayList<team>();
			for(int s=0;s<n;s++){
				team a = new team(in.next());
				for(int i=0;i<n-1;i++){
					int input = in.nextInt();
					switch(input){
					case 0:
						a.win++;
						break;
					case 1:
						a.lose++;
						break;
					case 2:
						a.hiki++;
						break;
					}
				}
				t.add(a);
			}
			Collections.sort(t);
			for(int i=0;i<n;i++)System.out.println(t.get(i).name);
		}
	}
}
class team implements Comparable<team>{
	int win,hiki,lose;
	String name;
	team(String name){
		win=0;
		hiki=0;
		lose=0;
		this.name = name;
	}
	public int compareTo(team obj) {
		if(this.win > obj.win)return -1;
		else if(this.win<obj.win)return 1;
		else if(obj.lose>this.lose)return -1;
		else return 0;
	}
}