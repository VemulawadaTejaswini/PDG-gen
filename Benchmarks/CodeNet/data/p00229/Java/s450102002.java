import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int b, r, g, c, s, t;
    int medal;

    void run(){
	while(sc.hasNext()){
	    b = sc.nextInt();
	    r = sc.nextInt();
	    g = sc.nextInt();
	    c = sc.nextInt();
	    s = sc.nextInt();
	    t = sc.nextInt();
	    if(!(b==0 && r==0 && g==0 && c==0 && s==0 && t==0)){
		    medal = 100;
		    solve();
	    }
	}
    }

    void solve(){
	int n;
	int turn=0;
	int Tturn = b+b*5+r+r*3+g+c+s*2;
	while(b>0){
	    b--; turn++;
	    medal += (15-3);
	    n=5;
	    while(n>0){
		n--; turn++;
		medal += (15-2);
	    }
	}
	while(r>0){
	    r--; turn++;
	    medal += (15-3);
	    n=3;
	    while(n>0){
		n--; turn++;
		medal += (15-2);
	    }
	}
	while(g>0){
	    g--; turn++;
	    medal += (7-3);
	}
	while(c>0){
	    c--; turn++;
	    medal += (2-3);
	}
	while(s>0){
	    s--; turn+=2;
	    medal -= 3;
	}
	medal -= (t-turn)*3;

	//System.out.println(t+" "+turn+"  *"+medal);
	System.out.println(medal);
    }
}