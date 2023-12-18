import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    Yield[] yield;
    int n;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;
	    yield = new Yield[n];
	    for(int i=0; i<n; i++)
		yield[i] = new Yield();

	    sort();
	    show();
	    System.out.println("#");
	}
    }

    void sort(){
	// バブルか何かのソート書く
	for(int i=0; i<n-1; i++){
	    for(int k=n-1; k>i; k--){
		double e1 = yield[i].getEffi();
		double e2 = yield[k].getEffi();
		if(e1<e2){
		    Yield tmp = yield[i];
		    yield[i] = yield[k];
		    yield[k] = tmp;
		}
		else if(e1==e2 &&
			yield[i].getName().compareToIgnoreCase(yield[k].getName())>0){
		    Yield tmp = yield[i];
		    yield[i] = yield[k];
		    yield[k] = tmp;
		}
	    }
	}
    }
	
    void show(){
	for(int i=0; i<n; i++)
	    System.out.println(yield[i].getName()/*+" "+yield[i].getEffi()*/);
    }
    
    class Yield{
	String name;
	double p, a, b, c, d, e, f, s, m;
	double time, made;
	double effi;

	Yield(){
	    name = sc.next();
	    effi = calc();
	}
	String getName(){ return name; }
	double getEffi(){ return effi; }

	double calc(){
	    p = sc.nextInt();
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    d = sc.nextInt();
	    e = sc.nextInt();
	    f = sc.nextInt();
	    s = sc.nextInt();
	    m = sc.nextInt();

	    time = a+b+c;
	    made = 0;
	    for(int i=0; i<m; i++){
		time += (d+e);
		made += f;
	    }

	    made = made*s - p;
	    return made/time;
	}
    }
}