import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong();
    long y = sc.nextLong();
    long z = sc.nextLong();    
    long k = sc.nextLong();  
    
    if (x <= k){
      if (x + y >= k){
      	System.out.println(x);
      }else{
        System.out.println(x + (-1*(k - x - y)));
      }
     }else{
      	System.out.println(k);
     }
    
  }
}
