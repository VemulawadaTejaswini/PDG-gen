import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, m;
    int point;
    int count;
    int[] map;
    int[] dice;
    int i;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    m = sc.nextInt();
	    if(n!=0){
		map = new int[n];
		dice = new int[m];
		for(i=0; i<n; i++)
		    map[i] = sc.nextInt();
		for(i=0; i<m; i++)
		    dice[i] = sc.nextInt();
		point = 0;
		count = 0;
		solve();
	    }
	}
    }

    void solve(){
	while(m>0 && point<map.length){
	    point += dice[count];
	    count++;
	    if(point>=map.length) continue;
	    point += map[point];
	    m--;	    
	}
	System.out.println(count);
    }
}