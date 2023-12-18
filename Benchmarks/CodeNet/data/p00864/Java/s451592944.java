import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    
    int n, w, max, maxP;
    int[] hist;
    double ans;

    void run(){
	while(true){
	    n = sc.nextInt();
	    w = sc.nextInt();
	    if(n==0 && w==0) break;

	    max = 0;
	    maxP = 0;
	    ans = 0;
	    hist = new int[100/w+1];
	    for(int i=0; i<n; i++){
		int k = sc.nextInt()/w;
		hist[k]++;
		max = Math.max(k, max);
		maxP = Math.max(hist[k], maxP);
	    }

	    for(int i=0; i<=max; i++){
		double x = (double)(max-i)/max * hist[i]/maxP;
		//System.out.println(x);
		ans += x;
	    }
	    ans += 0.01;

	    System.out.println(ans);
	}
    }
}