import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, s;
    int ans;
    int[] max, min;

    void run(){
	max = new int[10];
	min = new int[10];
	for(int i=1; i<10; i++)
	    setM(i, max, min);
	while(sc.hasNext()){
	    n = sc.nextInt();
	    s = sc.nextInt();
	    if(n!=0){
		ans = 0;
		//System.out.println("*"+max+" "+min);
		solve(100, 0, 0);
		System.out.println(ans);
	    }
	}
    }

    void solve(int level, int sum, int use){
	// BB start
	if(use==n-1){
	    if(s-sum>=0 && s-sum<=level) ans++;
	    return;
	}
	if(level<0 || use>n || sum>s) return;
	if(s>max[n-use] || s<min[n-use]) return;
	if(s==max[n] || s==min[n]){ ans++; return;}
	// BB end

	solve(level-1, sum+level, use+1);
	solve(level-1, sum, use);
    }

    void setM(int i, int[] max, int[] min){
	for(int k=0; k<i; k++){
	    max[i] += 100-k;
	    min[i] += k;
	}
    }
}