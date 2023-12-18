import java.util.Scanner;

public class Main{
    public static void main(String[]arg){
        Scanner sc = new (System.in);
        while(true){
            String x = sc.next();
            for(int i=0;;i++){
                char c = x.charAt(i);
                int n = c - '0';
                int sum += n;
            }
            System.out.println(sum);
        }
    }
}
