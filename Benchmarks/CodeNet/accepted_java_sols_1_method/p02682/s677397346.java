/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//2 1 1 3

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int k = sc.nextInt();
	int count =0;
	int res=0;
	
	if(k>0){
	    if(a>k){
	        res+=k;
	    }else{
	        res+=a;
	        k-=a;
	    }
	}
	if(k>0){
	    k-=b;
	}
	if(k>0){
	    if(c>k){
	        res-=k;
	    }else{
	        res-=c;
	        
	    }
	}
	System.out.println(res);
// 	while(k>0){
// 	    count=a;
// 	  System.out.println(k+"a");
// 	    k-=count;
// 	      System.out.println(k+"av");
// 	    k-= b;
// 	      System.out.println(k+"an");
// 	    count= count -c;
// 	      System.out.println(k+"am");
// 	    k-= c;
// 	      System.out.println(k+"ao");
// 	}
// 	     System.out.println(count);

	}
}
