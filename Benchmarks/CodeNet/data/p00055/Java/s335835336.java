import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(true) {
            double a = 0;
            try {
                a = sc.nextDouble();
            }catch(Exception e) {
                break;
            }
            double sum = a;
            for(int i = 2; i <= 10; i++) {
                if(i % 2 == 0) {
                    sum += a * 2;  
                    a *= 2;
                }
                if(i % 2 == 1) {
                    sum += a / 3;
                    a /= 3;
                }
            }
            System.out.println(sum);
        }
    }
}

