/**
 *2012/02/25
 *AOJ Volume0-0022
 *
 *
 *
 *
 *
 *
 *
 **/

import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	while(n!=0){

	    int[] num = new int[n];
	    for(int i=0; i<n; i++){
		num[i] = sc.nextInt();
	    }

	    int max = 0;
	    int min = 0;
	    int sum = 0;
	    int sum2 = 0;
	    for(int i=0; i<n; i++){
		sum += num[i];
		if(sum<min){min = sum;}
		if(sum-min>max){max = sum-min;}
	    }

	    System.out.println(max);

	    n = sc.nextInt();
	}
    }
}