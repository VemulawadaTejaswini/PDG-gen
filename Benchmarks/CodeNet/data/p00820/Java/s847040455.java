import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    int[] sq;
    int ans;

    void run(){
	sq = new int[200]; // under 1024*32
	for(int i=0; i<sq.length; i++)
	    sq[i] = i*i;

	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n!=0){
		ans = 0;
		int level = sq.length-1;
		while(n < sq[level]) level--;
		int use = 0;
		solve(n, level, use);
		System.out.println(ans);
	    }
	}
    }

    void solve(int n, int level, int use){
	// hajiki kokokara
	if(level==0 || use>=4 || n<0) return;
	if(use==3 && sq[level]<n) return;
	// hajiki kokomade

	solve(n, level-1, use);

	n -= sq[level];
	use++;
	if(n==0 && use<=4){
	    ans++;
	    return;
	}

	if(n>=sq[level]) solve(n, level, use);
	else solve(n, level-1, use);
    }
}