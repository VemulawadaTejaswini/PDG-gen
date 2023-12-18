import java.util.*;

class Main{

    String[] shape = {"Rock", "Fire", "Scissors", "Snake", "Human", "Tree", "Wolf", "Sponge", "Paper", "Air", "Water", "Dragon", "Devil", "Lightning", "Gun"};

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n==0) break;

	    boolean[] hands = new boolean[15];
	    for(int i=0; i<n; i++){
		String s = sc.next();
		for(int j=0; j<15; j++){
		    if(s.equals(shape[j])) hands[j] = true;
		}
	    }

	    boolean[] win = new boolean[15];
	    boolean[] lose = new boolean [15];
	    for(int i=0; i<15; i++){
		if(!hands[i]) continue;
		for(int j=1; j<=7; j++){
		    if(!hands[(i+j)%15])continue;
		    win[i] = true;
		    lose[(i+j)%15] = true;
		}
	    }
	    
	    ArrayList<String> winner = new ArrayList<String>();
	    for(int i=0; i<15; i++){
		if(win[i] && !lose[i]){
		    if(!winner.contains(shape[i]))winner.add(shape[i]);
		    if(winner.size()>=2) break;
		}
	    }

	    if(winner.size()==1){
		System.out.println(winner.get(0));
	    }else{
		System.out.println("Draw");
	    }
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}