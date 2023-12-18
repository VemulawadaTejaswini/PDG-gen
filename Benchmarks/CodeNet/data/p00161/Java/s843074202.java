import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			team[] list = new team[n];
			for(int s=0;s<n;s++){
				list[s]=new team(in.nextInt());
				for(int i=0;i<4;i++){
					list[s].plus(in.nextInt(),in.nextInt());
				}
			}
			Arrays.sort(list);
			System.out.println(list[0].ban);
			System.out.println(list[1].ban);
			System.out.println(list[n-2].ban);
		}
	}
}
class team implements Comparable<team>{
	double time;
	int ban;
	team(int ban){
		time=0;
		this.ban=ban;
	}
	public void plus(int hun,int byou){
		time+=hun*60;
		time+=byou;
	}
	public int compareTo(team o) {
		if(this.time<o.time)return -1;
		else if(this.time>o.time)return 1;
		return 0;
	}
}