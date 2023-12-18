import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    Player[] p;
    int n;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    p = new Player[n];
	    for(int i=0; i<n; i++)
		p[i] = new Player(sc.nextInt(), sc.nextInt());
	    
	    
	    Arrays.sort(p, new Comparator<Player>(){
		    public int compare(Player p1, Player p2){
			int g1 = p1.getGet();
			int g2 = p2.getGet();
			if(g1 != g2) return g2-g1;
			int n1 = p1.getNum();
			int n2 = p2.getNum();
			return n1-n2;
		    }
		}
		);

	    System.out.println(p[0].getNum()+" "+p[0].getGet());
	}
    }

    class Player{
	int num, get;
	Player(int n, int g){
	    num = n;
	    get = g;
	}
	int getGet(){ return get; }
	int getNum(){ return num; }
    }
}