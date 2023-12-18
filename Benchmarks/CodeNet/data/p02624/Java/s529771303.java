import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        int count=0;

        for (int j = 1; j <= n; j++) {
            
            for (int i = 1; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    
                    if (j / i == i){
                        count++;
                    }
                        

                    else {
                        count++;
                        count++;
                    }
                }
                
            }
            sum+=count*j;
            count=0;
        }
        System.out.println(sum);
    }
}