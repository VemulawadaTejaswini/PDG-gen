import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rep = sc.nextInt();

        for(int u = 0; u < rep; u++){
            String a = sc.next();
            String b = sc.next();

            int longer;
            if(a.length() > b.length()){
                longer = a.length();
            }else{
                longer = b.length();
            }

            int[] sum = new int[longer+1];
            int memory = 0;

            for(int i = 1; i <= longer; i++){
                if(a.length() >= i && b.length() >= i){
                    memory = Integer.parseInt("" + a.charAt(a.length()-i)) + Integer.parseInt("" + b.charAt(b.length()-i)) + memory;
                    sum[i-1] = memory % 10;
                    memory = memory / 10;
                }else if(a.length() >= i && b.length() < i){
                    memory = Integer.parseInt("" + a.charAt(a.length()-i)) + memory;
                    sum[i-1] = memory % 10;
                    memory = memory / 10;
                }else{
                    memory = Integer.parseInt("" + b.charAt(b.length()-i)) + memory;
                    sum[i-1] = memory % 10;
                    memory = memory / 10;
                }
            }
            sum[longer] = memory;

            if(longer > 80 || (longer == 80 && sum[80] > 0)){
                System.out.println("overflow");
                continue;
            }

            boolean zero_check = true;

            for(int i = longer; i > 0; i--){
                if(zero_check && sum[i] == 0){
                    continue;
                }else if(zero_check && sum[i] > 0){
                    zero_check = false;
                    System.out.print(sum[i]);
                }else{
                    System.out.print(sum[i]);
                }
            }
            System.out.println(sum[0]);

        }
    }
}