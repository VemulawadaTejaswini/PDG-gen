import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int k = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            boolean isNg = true;
            int i = 0;
            while(k <= b){
                k += i;
                if(i == 0) i = k;
                if(a <= k && k <= b){
                    System.out.println("OK");
                    isNg = false;
                    break;
                }
            }

            if(isNg) System.out.println("NG");

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
