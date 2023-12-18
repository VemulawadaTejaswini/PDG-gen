import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    Vector<Integer> aM; // appearMod
    int[] mod;
    int[] appearAns;
    int n, mm;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n!=0){
		aM = new Vector<Integer>();
		appearAns = new int[(n-1)/2+1];
		mm = (n-1)/2;
		solve();
	    }
	}
    }

    void solve(){
	for(int i=1; i<n; i++){
	    int s = (i*i) % n;
	    if(!aM.contains(s)) aM.add(s);
	}

	mod = new int[aM.size()];
	for(int i=0; i<mod.length; i++)
	    mod[i] = aM.elementAt(i);

	setAns(0, -1);
	for(int i=1; i<appearAns.length; i++)
	    System.out.println(appearAns[i]);
    }


    void setAns(int level, int sum){
	if(level==mod.length) return;

	// mod[level] を使わない
	setAns(level+1, sum);	    
	// mod[level] を使う
	if(sum==-1) setAns(level+1, mod[level]);
	else{
	    int sumA = calc(sum, mod[level]);
	    int sumB = calc(mod[level], sum);
	    appearAns[sumA]++;
	    appearAns[sumB]++;
	}
    }

    int calc(int a, int b){
	int sum = a-b;
	if(sum < 0) sum += n;
	if(sum > mm) sum = n-sum;
	return sum;
    }
}