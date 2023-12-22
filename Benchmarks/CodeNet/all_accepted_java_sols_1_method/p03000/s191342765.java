import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int result = 1;
        int pos = 0;
        for(int i = 0; i < N; i++){
            int L = sc.nextInt();
            if(pos + L > X){
                break;
            }
            pos += L;
            result++;
        }
        System.out.println(result);
    }
}
