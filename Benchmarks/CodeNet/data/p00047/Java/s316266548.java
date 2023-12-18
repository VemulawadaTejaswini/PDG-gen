import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    boolean a, b, c; // ボールが入っていたらtrue

    void run(){
	a = true;
	b = false;
	c = false;

	String ans = solve();
	System.out.println(ans);
    }

    String solve(){
	while(sc.hasNext()){
	    String s = sc.next();
	    String l = s.substring(0, 1);
	    String r = s.substring(2, 3);
	    check(l, r);
	}
	if(a) return "A";
	else if(b) return "B";
	else return "C";
    }

    void check(String l, String r){
	if(l.equals("A")){
	    if(r.equals("B"))  change(a, b);
	    else change(a, c);
	}
	else if(l.equals("B")){
	    if(r.equals("A")) change(b, a);
	    else change(b, c);
	}
	else{
	    if(r.equals("A")) change(c, a);
	    else change(c, b);
	}
    }
    void change(boolean p, boolean q){
	boolean	m;
	m = p;
	p = q;
	q = m;
    }
}