import java.util.*;
class Solution{
 public static void main(String[] args){
 	Scanner sc=new Scanner(System.in);
   	int n=sc.nextInt();
   	String S=sc.next();
   	if(S.length<=n){
      System.out.println(S);
    }
   	else{
     System.out.println(S.substring(0,n)+"..."); 
    }
 }
}