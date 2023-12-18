import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int n = kbd.nextInt();
	while(n>0){
	    solve();
	    n--;
	}
    }

    static void solve(){
	int[] r = {0, 0};
	int[] max = {0, 0};
	int maxd = 0;


	int x = kbd.nextInt();
	int y = kbd.nextInt();
	int d = 0;
	while(! (x==0 && y==0)){
	    r[0] += x;
	    r[1] += y;
	    d = r[0]*r[0] + r[1]*r[1];
	    //System.out.println(max[0]+" "+max[1]);
	    if(d > maxd){
		maxd = d;
		max[0] = r[0];
		max[1] = r[1];
	    }
	    else if(d==maxd && r[0]>max[0]){
		maxd = d;
		max[0] = r[0];
		max[1] = r[1];
	    }
	    x = kbd.nextInt();
	    y = kbd.nextInt();
	}

	System.out.println(max[0]+" "+max[1]);
    }
}