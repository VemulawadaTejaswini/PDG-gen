import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
         int A=sc.nextInt();
         int B=sc.nextInt();
         
         int consent=1;
         int tap=0;
         int num=0;
         while(consent<B){
             consent-= 1;
             consent+=A;
             tap+=1;
         }
         
         
         System.out.println(tap);
    }
}
