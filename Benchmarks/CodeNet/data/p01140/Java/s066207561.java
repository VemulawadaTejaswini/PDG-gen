import java.util.*;

class Main{
    int n,m;
    int[] h,w;

    void solve(){
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	while(n!=0){
	    m = sc.nextInt();
	    h = new int[n];
	    w = new int[m];
	    for(int i=0; i<n; i++){h[i] = sc.nextInt();}
	    for(int i=0; i<m; i++){w[i] = sc.nextInt();}
	    int nsum = 0, msum = 0;
	    for(int i=1; i<=n; i++)nsum+=i;
	    for(int i=1; i<=m; i++)msum+=i;
	    int[] hlist = new int[nsum];
	    int[] wlist = new int[msum];
	    int index = 0;
	    for(int i=0; i<n; i++){
		for(int j=i; j<n; j++){
		    int sum = 0;
		    for(int k=i; k<=j; k++){
			sum += h[k];
		    }
		    hlist[index] = sum;
		    index++;
		}
	    }
	    index = 0;
	    for(int i=0; i<m; i++){
		for(int j=i; j<m; j++){
		    int sum = 0;
		    for(int k=i; k<=j; k++){
			sum += w[k];
		    }
		    wlist[index] = sum;
		    index++;
		}
	    }

	    Arrays.sort(hlist);
	    Arrays.sort(wlist);

	    int count = 0;
	    for(int i=0; i<hlist.length; i++){
		for(int j=0; j<wlist.length; j++){
		    if(hlist[i]<wlist[j])break;
		    if(hlist[i]==wlist[j])count++;
		}
	    }
	    
	    System.out.println(count);
	    
	    n = sc.nextInt();
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}