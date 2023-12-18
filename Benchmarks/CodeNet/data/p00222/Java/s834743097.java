//配列に入れたらTime Limit Exceededでした.
//直しても直してもTime Limit Exceededですよー!

import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);

    //static int[] p = new int[10000000];

    public static void main(String[] args){
	//prepare();

	while(true){
	    int n = kbd.nextInt();
	    if(n==0) break;
	    solve(n);
	}
    }

    static void solve(int n){
	/*
	  int i = 0;
	  while(quatro[i]>n) i++;
	  System.out.println(quatro[i]);
	*/
	while(!(check(n))){
	    n--;
	}
	System.out.println(n);
    }

    /*
    static void prepare(){
	
	  int m = 10000000;
	  int i = 0;
	  for(; m-8>1; m--){
	  if(check(m)) {
	  quatro[i] = m;
	  i++;
	  }
	  }
	  //System.out.print(quatro[i-1]+" "+i);
	  

	int j=0;
	int i=2;
	for(; i<=m && i<10000000; i++){
	    if(prime(i)) {
		p[j] = i;
		j++;
	    }
	}
	//System.out.println(p[j-1]+" "+j);
    }
    */
    
    static boolean check(int m){
	if(!prime(m)) return false;
	if(!prime(m-2)) return false;
	if(!prime(m-6)) return false;
	if(!prime(m-8)) return false;
	return true;
    }
    
    static boolean prime(int a){
	int k = (int)Math.sqrt(a);
	for(int i=2; i<=k; i++){
	    if(a%i == 0) return false;
	}
	return true;
    }
}