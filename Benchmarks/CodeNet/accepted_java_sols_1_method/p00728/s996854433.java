import java.util.*;

public class Main{

    public static void main(String[] args){
        int n;
        int max, min, sum = 0, cur;
        Scanner scanner = new Scanner(System.in);

        int i;

        n = scanner.nextInt();
        while(n != 0){

            cur = scanner.nextInt();
            max = cur;
            min = cur;
            
            cur = scanner.nextInt();
            if(cur > max) max = cur;
            else min = cur;

            sum = 0;
            
            for(i = 0; i < n - 2; i++){
                cur = scanner.nextInt();
                if(cur > max){
                    sum = sum + max;
                    max = cur;
                }
                else if(cur < min){
                    sum = sum + min;
                    min = cur;
                }
                else sum = sum + cur;
            }
            sum = sum / (n - 2);
            System.out.println(sum);
            n = scanner.nextInt();
        }

        scanner.close();
    }
}
