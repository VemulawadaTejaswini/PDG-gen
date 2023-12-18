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
	    bag = new int[w+1];
	    solve();

	    for(int i=w; i>=0; i--)
		if(ansN < bag[i]){
		    ansN = bag[i];
		    ansW = i;
		}
		else if(ansN==bag[i] && ansW>i)
		    ansW = i;

	    System.out.println(ansN);
	    System.out.println(ansW);
	}
    }

    void solve(){
	for(int k=0; k<item.length; k++){
	    int size = item[k].getW();
	    int worth = item[k].getN();
	    for(int i=w; i>=0; i--){
		if(bag[i]!=min && i+size<bag.length)
		    bag[i+size] = Math.max(bag[i+size], bag[i]+worth);
	    }
	}
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