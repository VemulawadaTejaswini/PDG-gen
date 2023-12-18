import java.util.*;

class Main{

    int N;
    ArrayList<Integer> numList;

    void solve(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    N = sc.nextInt();
	    if(N==0) break;

	    numList = new ArrayList<Integer>();
	    for(int i=1; i*i<=N && i<N; i++){
		if(N%i==0){
		    if(!numList.contains(i)) numList.add(i);
		    if(N/i!=N && !numList.contains(N/i)) numList.add(N/i);
		}
	    }

	    long sum = 0;
	    for(int i=0; i<numList.size(); i++)sum += numList.get(i);

	    String ans = "perfect number";
	    if(sum>N){
		ans = "abundant number";
	    }else if(sum<N){
		ans = "deficient number";
	    }

	    System.out.println(ans);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}