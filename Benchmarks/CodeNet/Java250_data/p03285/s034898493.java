import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int n = Integer.parseInt(sc.next()); 

   for(int i=0; i<=n/7; i++){
     for(int j=0; j<=(n-7*i)/4; j++){
       if(7*i + 4*j == n){
         System.out.println("Yes");
	 System.exit(0);
       }
     }
   }

   System.out.println("No");
  }
}
