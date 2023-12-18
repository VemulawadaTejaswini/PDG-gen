import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    class Cake{
	int num, p, q, r, Kcal;
	Cake(int i, int p, int q, int r){
	    num=i; this.p=p; this.q=q; this.r=r;
	    Kcal = (p+r)*4+q*9;
	}

	boolean check(int P, int Q, int R, int C){
	    return p<=P && q<=Q && r<=R && Kcal<=C;
	}

	int getNum(){ return num; }
    }

    int n;
    int[] ans;
    int P, Q, R, C;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;
	    ans = new int[n];
	    Arrays.fill(ans, Integer.MAX_VALUE);
	    Cake[] cakes = new Cake[n];

	    for(int i=0; i<n; i++)
		cakes[i] = new Cake(sc.nextInt(), sc.nextInt(), 
				    sc.nextInt(), sc.nextInt());

	    P = sc.nextInt();
	    Q = sc.nextInt();
	    R = sc.nextInt();
	    C = sc.nextInt();

	    for(int i=0; i<n; i++)
		if(cakes[i].check(P, Q, R,C))
		    ans[i] = cakes[i].getNum();

	    Arrays.sort(ans);
	    if(ans[0]==Integer.MAX_VALUE)
		System.out.println("NA");
	    else
		for(int i=0; ans[i]!=Integer.MAX_VALUE; i++)
		    System.out.println(ans[i]);
	}
    }
}