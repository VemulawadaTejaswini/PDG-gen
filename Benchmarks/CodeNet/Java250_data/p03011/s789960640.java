import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt(); 

      int a = P+Q;
      int b = P+R;
      int c = Q+R;
      
      if(a<=b && a<=c){
    System.out.println(a);
      }else if(b<=c && b<=a){
	System.out.println(b);
      }else{
    System.out.println(c);
      }
      }
}