import java.util.*;
import java.lang.*;

public class Main{
    int a[] = {3, 0, 1};

    Main(){
	Scanner sc = new Scanner(System.in);
	boolean f = false;
	while(sc.hasNext()){
	    int n = sc.nextInt();
	    if(n == 0) break;
	    if(f) System.out.println();
	    f = true;
	    Vector<Tm> vec = new Vector<Tm>();

	    for(int i = 0; i < n; i++){
		String nm = sc.next();
		int s = 0;
		for(int j = 0; j < 3; j++) s += (a[j]*sc.nextInt());
		vec.add(new Tm(nm, s));
	    }
	    Collections.sort(vec);

	    for(int i = 0; i < vec.size(); i++) (vec.get(i)).print();
	}
    }

    public static void main(String[] args){
	new Main();
    }
}

class Tm implements Comparable<Tm>{
    public String nm;
    public int sc;

    public Tm(){}
    public Tm(String nm, int sc){
	this.nm = nm;
	this.sc = sc;
    }

    public int compareTo(Tm tm){
	if(this.sc > tm.sc) return -1;
	if(this.sc < tm.sc) return 1;
	return 0;
    }

    public void print(){
	System.out.println(nm+","+Integer.toString(sc));
	return ;
    }
}