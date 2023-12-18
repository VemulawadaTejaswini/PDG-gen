import java.util.*;

class Main{
    int n,m;
    int[] h,w;

    void solve(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    n = sc.nextInt(); m = sc.nextInt();
	    if(n==0 && m==0) break;
	    h = new int[n];
	    w = new int[m];
	    for(int i=0; i<n; i++) h[i] = sc.nextInt();
	    for(int i=0; i<m; i++) w[i] = sc.nextInt();
	    int max = 1000*1500+1;
	    int[] hlist = new int[max];
	    int[] wlist = new int[max];

	    for(int i=0; i<n; i++){
		int sum = 0;
		for(int j=i; j<n; j++){
		    sum += h[j];
		    hlist[sum]++;
		}
	    }
	    for(int i=0; i<m; i++){
		int sum = 0;
		for(int j=i; j<m; j++){
		    sum += w[j];
		    wlist[sum]++;
		}
	    }

	    int count = 0;
	    for(int i=0; i<hlist.length; i++){
		count += hlist[i]*wlist[i];
	    }
	    
	    System.out.println(count);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}