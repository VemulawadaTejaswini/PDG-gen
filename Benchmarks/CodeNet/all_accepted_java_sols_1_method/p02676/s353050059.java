import java.util.*;
class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
    
    int lenS = s.length();
    
    if( lenS > k ) {
        System.out.println( s.substring(0, k) + "...");    
    }else{
        System.out.println( s );    
    }
  }
}
