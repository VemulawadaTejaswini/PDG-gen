import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = Long.parseLong(sc.next());
    long k = Long.parseLong(sc.next());
    long d = Long.parseLong(sc.next());
    
    long now = x;
    for(int i=0; i<k; i++){
      if(now>0){
        now = now - d;
      }
      else{
        now = now + d;
      }

    }

    System.out.println(Math.abs(now));
   
    sc.close();
    return;
  }
  
}
