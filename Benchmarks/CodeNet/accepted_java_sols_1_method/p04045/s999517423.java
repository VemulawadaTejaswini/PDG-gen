import java.io.*;
import java.util.*;
class Main{
 public static void main(String args[]){
   Scanner in = new Scanner(System.in);
 	int N = in.nextInt();
   	int K = in.nextInt();
   	boolean check[]=new boolean[10];
   	Arrays.fill(check,true);
   int ans=0;
   	for(int i =0;i<K;i++){
    	check[in.nextInt()] = false;
    }
   
  	for(int i = N;true;i++){
    	int a = i;
      	boolean hello = true;	
      while(a>0){
   			int d = a%10;
          	if(!check[d]) {
              hello = false;
              break;
            }
        	a/=10;
        }
      	if(hello){
          	ans = i;
  			break;      	
        }
    }
  
   System.out.println(ans);
 }
}