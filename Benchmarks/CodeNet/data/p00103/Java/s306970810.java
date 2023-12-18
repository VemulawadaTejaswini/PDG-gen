import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    boolean[] base;
    int out, point, n;
    String event;

    void run(){
	n = sc.nextInt();
	out = 0;
	point = 0;
	base = new boolean[3];
	while(n>0){
	    if(out!=3) solve();
	    else {
		System.out.println(point);
		point = 0;
		out = 0;
		Arrays.fill(base, false);
		n--;
	    }
	}
    }

    void solve(){
	event = sc.next();
	if(event.equals("HIT")){
	    boolean next = true;
	    for(int i=0; i<base.length; i++){
		if(next){
		    next = base[i];
		    base[i] = true;
		}
		else{
		    next = base[i];
		    base[i] = false;
		}
	    }
	    if(next) point++;
	}
	else if(event.equals("HOMERUN")){
	    for(int i=0; i<base.length; i++){
		if(base[i]) point++;
		base[i] = false;
	    }
	    point++;
	}
	else out++;
    }
}