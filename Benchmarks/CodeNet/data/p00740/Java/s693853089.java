import java.io.*;
import java.util.*;

public class Main{
	private static void solve(int n_can,int n_stn) {
    	int[] can_stn= new int[n_can];
    	
    	int tmp=0;
    	int n_cup= n_stn;
		while(true){
			if( n_cup==0 ){
				n_cup= can_stn[tmp];
				can_stn[tmp]= 0;
				tmp= (tmp+1)% n_can;
			} else{
				int div = n_cup / n_can;
				int rem = n_cup % n_can;
				for (int i = 0; i < n_can; i++) {
					can_stn[i] += div;
				}
				for (int i = 0; i < rem; i++) {
					can_stn[tmp] += 1;
					tmp= (tmp+1)% n_can;
				} 
				tmp= (tmp-1+n_can)% n_can;
				if( can_stn[tmp]==n_stn ){
					System.out.println(tmp);
					break;
				}
				n_cup= 0;
				tmp= (tmp+1)% n_can;
			}
		}
	}
	
    public static void main(String args[]) throws Exception{
    	Scanner sc= new Scanner(System.in);
    	int n_can,n_stn;
    	while(true){
    		n_can= sc.nextInt();
    		n_stn= sc.nextInt();
    		if( n_can!=0 || n_stn!=0 ){
    			solve(n_can,n_stn);
    		} else{ break; }
    	}
    }
}