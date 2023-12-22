import java.util.*;
 class Main {
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int t = sc.nextInt();
      int a = 0;
      
      if(n%x > 0) a = 1;
      System.out.println(((n / x) + a )* t) ;
      
      sc.close();
      
    }
 }
