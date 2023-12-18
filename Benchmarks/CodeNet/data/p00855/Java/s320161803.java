//一番近い素数までの合計距離

import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	boolean[] PrimeN = new boolean[1299710];//問題中の最大素数まで
	putN(PrimeN);

	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		solve(n, PrimeN);
	    }
	}
    }

    static void solve(int n, boolean[] PrimeN){
	if(PrimeN[n]) System.out.println("0");
	else{
	    int fn = n+1;
	    int bn = n-1;
	    while(!PrimeN[fn]) fn++;
	    while(!PrimeN[bn]) bn--;
	    System.out.println(fn-bn);
	}
    }

    static void putN(boolean[] p){
	Arrays.fill(p, true);
	p[0] = false;
	p[1] = false;
	for(int i=2; i<p.length; i++){
	    if(p[i]){
		for(int j=i+i; j<p.length; j+=i){
		    p[j] = false;
		}
	    }
	    //System.out.println(i+" "+p[i]);
	}
    }
}