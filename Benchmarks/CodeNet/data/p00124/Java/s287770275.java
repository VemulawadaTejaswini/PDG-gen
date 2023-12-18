import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int f = 0;
		while(true){
			if(f == 1){
				System.out.println();
			}
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			Team[] team = new Team[n];
			
			for(int i = 0; i < n; i++){
				String str = sc.next();
				int score = (sc.nextInt())*3 + (sc.nextInt())*0 + sc.nextInt();
				team[i] = new Team(str, score);
			}
			sort(team, n);
			
			for(int i = 0; i < n; i++){
				team[i].print();
			}
			
			f = 1;
		}
	}
	
	void sort(Team team[], int n){
		Team tmp;
		for(int i = n-1; i >= 0; i--){
			for(int j = 1; j <= i; j++){
				if(team[j].get() > team[j-1].get()){
					tmp = team[j];
					team[j] = team[j-1];
					team[j-1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}

class Team{
	private String str;
	private int score;
	
	public Team(String str, int score){
		this.str = str;
		this.score = score;
	}
	
	public int get(){
		return score;
	}
	
	public void print(){
		System.out.println(str+","+score);
	}
}