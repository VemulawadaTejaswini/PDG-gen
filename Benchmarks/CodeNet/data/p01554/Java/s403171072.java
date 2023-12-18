import java.util.*;
public class Main{
    public static void main(String[]args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    int n, m;
    String[] id;
    String s;
    boolean open; // true なら開いている

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    id = new String[n];
	    open = false;
	    for(int i=0; i<n; i++)
		id[i] = sc.next();
	    m = sc.nextInt();
	    solve();
	}
    }

    void solve(){
	while(m>0){
	    m--;
	    s = sc.next();
	    if(check()){
		if(open){
		    System.out.println("Closed by "+s);
		    open = false;
		}
		else {
		    System.out.println("Opened by "+s);
		    open = true;
		}
	    }
	    else System.out.println("Unknown "+s);
	}
    }

    boolean check(){
	boolean know = false;
	for(int i=0; i<id.length; i++)
	    if(s.equals(id[i])) know = true;
	return know;
    }
}