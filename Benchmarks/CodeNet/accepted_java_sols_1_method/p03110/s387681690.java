import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0;
        for(int i = 0; i < n;i++){
            double num = sc.nextDouble();
            String s = sc.next();
            if(s.equals("JPY")){
                sum += num;
            } else {
                sum += num *  380000.0;
            }
        }
        System.out.println(sum);
    }
}