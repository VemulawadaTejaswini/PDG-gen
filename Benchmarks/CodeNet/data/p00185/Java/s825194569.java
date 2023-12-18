import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    boolean[] prime;
    int n;
    int count;

    void run(){
	prime = new boolean[1000001];
	setPrime();
	while(sc.hasNext()){
	    n = sc.nextInt();
	    count = 0;
	    if(n!=0) solve();
	}
    }

    void solve(){
	for(int i=2; i<=n/2; i++){
	    if(prime[i] && prime[n-i])
		count++;
	}
	System.out.println(count);
    }

    void setPrime(){
	Arrays.fill(prime, true);
	prime[0] = prime[1] = false;
	for(int i=2; i<prime.length; i++){
	    for(int j=i+i; j<prime.length; j+=i){
		prime[j] = false;
	    }
	}
    }
}