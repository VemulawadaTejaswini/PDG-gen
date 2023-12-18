import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    String[] ring;
    String s;
    int count;
    int i, point;

    void run(){
	while(sc.hasNext()){
	    s = sc.next();
	    n = sc.nextInt();
	    ring = new String[n];
	    for(i=0; i<n; i++)
		ring[i] = sc.next();
	    count = 0;
	    solve();
	}
    }

    void solve(){
	for(i=0; i<n; i++)
	    if(search(ring[i])) count++;
	System.out.println(count);
    }

    boolean search(String c){
	point = 0;
	int start = 0;
	int m = 0;
	boolean cont = true;
	boolean[] flag = new boolean[c.length()];
	Arrays.fill(flag, true);
	boolean now = true;
	boolean find = false;

	while(cont){
	    //System.out.println("*"+point+" "+m);
	    boolean tf = 
		s.substring(m, m+1).equals(c.substring(point, point+1));
	    if(tf){
		point = (point+1)%10;
		m++;
		if(m>=s.length()) find = true;
	    }
	    else{
		flag[start] = false;
		start = (start+1)%10;
		point = start;
		m = 0;
	    }
	    cont = !find && flag[start];
	}

	return find;
    }
}
	