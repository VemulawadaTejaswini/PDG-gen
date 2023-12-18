import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, m, ans;
    int[] sn, ew;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    m = sc.nextInt();
	    if(n==0 && m==0) break;
	    sn = new int[n];
	    ew = new int[m];
	    for(int i=0; i<n; i++)
		sn[i] = sc.nextInt();
	    for(int i=0; i<m; i++)
		ew[i] = sc.nextInt();
	    ans = 0;

	    for(int i=0; i<n; i++)
		for(int k=0; k<m; k++){
		    solve(i, k);
		}
	    System.out.println(ans);
	}
    }

    void solve(int i, int k){
	int sumA=sn[i], sumB=ew[k];
	i++; k++;
	while(true){
	    if(sumA==sumB){
		//System.out.println("**"+sumA);
		ans++;
		if(i==n || k==m) break;
		sumA += sn[i];
		sumB += ew[k];
		i++;
		k++;
	    }
	    else if(sumA<sumB){
		if(i==n) break;
		sumA += sn[i];
		i++;
	    }
	    else if(sumA>sumB){
		if(k==m) break;
		sumB += ew[k];
		k++;
	    }
	}
    }
}