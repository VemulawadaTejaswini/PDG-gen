import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	private static class Team implements Comparable<Team>{
		public String name;
		public int win;
		public int lose;
		
		public Team(String name, int win, int lose){
			this.name = name;
			this.win = win;
			this.lose = lose;
		}
		
		@Override
		public String toString(){
			return name;
		}

		@Override
		public int compareTo(Team other) {
			if(this.win > other.win){
				return -1;
			}else if(this.win == other.win){
				if(this.lose < other.lose){
					return -1;
				}else if(this.lose == other.lose){
					return 0;
				}else{
					return 1;
				}
			}else{
				return 1;
			}
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int teams = Integer.parseInt(sc.nextLine());
			
			if(teams == 0){
				break;
			}
			
			ArrayList<Team> list = new ArrayList<Team>(teams);
			
			for(int i = 0; i < teams; i++){
				String[] strs = sc.nextLine().split(" ");
				
				int win = 0,lose = 0;
				for(int j = 1; j < strs.length; j++){
					int tmp = Integer.parseInt(strs[j]);
					
					if(tmp == 0){
						win++;
					}else if(tmp == 1){
						lose++;
					}
				}
				
				list.add(new Team(strs[0],win,lose));
			}
			
			
			Collections.sort(list);
			
			for(Team t : list){
				System.out.println(t);
			}
		}
	}
	
}