import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double answer = 0;

        for (int i = 0; i < cnt; i++) {
            float amount =sc.nextFloat() ;
            String type = sc.next();
            if(type.equals("JPY")) answer += amount;           
            if(type.equals("BTC")) answer += amount * 380000.0;
        }
        System.out.println(answer);
    }
}