import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	double reg =1;
    	Scanner sc = new Scanner(System.in);
    	double m = sc.nextDouble();
    	double n = sc.nextDouble();
    	for(double i=0;i<n;i++){
    		reg*=m;
    		if(reg>=1000000007){
    			reg=reg%1000000007;
    		}
    	}
    	reg=(double)reg%1000000007;
    	System.out.println((int)reg);
    }
}

