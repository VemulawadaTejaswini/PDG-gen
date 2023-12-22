import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
    	int c = Integer.parseInt(sc.next());
    	int k = Integer.parseInt(sc.next());
    	int i = 0;
    while(a >= b){
       b*=2;
       i++;
     }
     while(b >= c){
       c*=2;
       i++;
     }
     
   
    if(i<=k){
		System.out.println("Yes");
      }else{
    System.out.println("No");
    }
 /*System.out.println(a);
     System.out.println(b);
     System.out.println(c);
    System.out.println(i);
     System.out.println(k); */
  }
}