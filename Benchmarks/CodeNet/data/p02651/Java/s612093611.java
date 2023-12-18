import java.util.Scanner;
import java.util.ArrayList; 

class Calc{
    void solve(ArrayList<ArrayList<Long>> a,ArrayList<String> s,long t){
	for(long i=0;i<t;i++){
	    int w = 0;
	    //System.out.println(s.get(i).length());
	    for(long k=s.get((int)i).length()-1;k>=0;k--){
		//System.out.println(a.get(i).size());
		//System.out.println(s.get(i).charAt(k));
		if(s.get((int)i).charAt((int)k)=='0'){
		    //System.out.println("0のターン");
		    if(a.get((int)i).get((int)k)%2==1){
			break;
		    }
		}else{
		    //System.out.println("1のターン");
		    if(a.get((int)i).get((int)k)%2==1){
			w = 1;
			break;
		    }
		}
	    }
	    System.out.println(w);
	}
    }
}

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	//System.out.println("t?");
	long t = sc.nextLong();
	ArrayList<ArrayList<Long>>ai = new ArrayList<>();
	ArrayList<String> p = new ArrayList<>();
	for(long i=0;i<t;i++){
	    ai.add(new ArrayList<Long>());
	    //System.out.println("n?");
	    long n = sc.nextLong();
	    for(int j=0;j<n;j++){
		//System.out.println("ai?");
		ai.get((int)i).add(sc.nextLong());
	    }
	    //System.out.println("s?");
	    p.add(sc.next());
	}
	Calc calc = new Calc();
	calc.solve(ai,p,t);
	sc.close();
      }
}
