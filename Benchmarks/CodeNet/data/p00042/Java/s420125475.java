import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int c, w, n;
    int[] bag;
    int min = Integer.MIN_VALUE;
    Item[] item;
    int ansW, ansN;

    void run(){
	c = 1;
	while(sc.hasNext()){
	    w = sc.nextInt();
	    if(w==0) break;
	    System.out.println("Case "+c+":");
	    c++;

	    n = sc.nextInt();
	    item = new Item[n];
	    for(int i=0; i<n; i++)
		item[i] = new Item(sc.next().split(","));

	    ansW = min;
	    ansN = min;
	    solve(0, 0, 0);
	    System.out.println(ansN);
	    System.out.println(ansW);
	}
    }

    void solve(int W, int N, int i){
	//System.out.println(W+" "+N+" "+i);
	if(W>w) return;
	if(W<=w){
	    if(ansN < N){ ansW = W; ansN=N; }
	    else if(ansN==N && ansW > W){ ansW = W; }
	}
	if(i==n) return;
	int a = item[i].getW();
	int b = item[i].getN();
	solve(W+a, N+b, i+1);
	solve(W, N, i+1);
    }

    class Item{
	int w, n;
	Item(String[] a){
	    n = Integer.parseInt(a[0]);
	    w = Integer.parseInt(a[1]);
	}
	int getW(){ return w; }
	int getN(){ return n; }
    }
}