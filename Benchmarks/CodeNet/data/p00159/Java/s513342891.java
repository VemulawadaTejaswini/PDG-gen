import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, ansNum;
    double ansBMIabs;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n!=0) {
		ansNum = Integer.MAX_VALUE;
		ansBMIabs = Double.MAX_VALUE;
		solve();
	    }
	}
    }

    void solve(){
	while(n>0){
	    n--;
	    int id = sc.nextInt();
	    double h = sc.nextDouble()/100;
	    double w = sc.nextDouble();
	    double abs = Math.abs(22 - (w/h/h));
	    //System.out.println(id+" "+abs);
	    if(abs<=ansBMIabs){
		ansNum = id;
		ansBMIabs = abs;
	    } 
	    else if(abs==ansBMIabs && id<ansNum){
		ansNum = id;
		ansBMIabs = abs;
	    }
	}

	System.out.println(ansNum);
    }
}