import java.util.*;
import java.lang.*;
public class Main {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            long n = scanner.nextLong();
            long a =scanner.nextLong();
            long b =scanner.nextLong();
            long totalPlaced=n/(a+b);
            long remainder=n%(a+b);
            long totalA=0;
            if(remainder>a){
                totalA+=a;
            }else{
                totalA+=remainder;
            }
            totalA+=(totalPlaced*a);
            System.out.println(totalA);

    }
}



