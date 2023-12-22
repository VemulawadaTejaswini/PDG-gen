import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int now = 1;
        int result = 0;
        while(now < B){
            now--;
            now += A;
            result++;
        }
        System.out.println(result);
    }
}
