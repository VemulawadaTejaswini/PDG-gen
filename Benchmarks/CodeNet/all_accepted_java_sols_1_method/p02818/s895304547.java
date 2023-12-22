import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
      
        if(a>k){
          a-=k;
        }else if(a<=k){
          k-=a; a=0;
          if(b>k){
            b-=k;
          }else if(b<=k){
            b=0;
          }
        }
        System.out.println(a + " " + b);
    }
}
