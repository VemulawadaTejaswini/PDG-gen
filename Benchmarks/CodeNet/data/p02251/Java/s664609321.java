import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] money = {1,5,10,25};
        int sum = 0;
        for(int i = 3 ; i >= 0 ; i--){
            sum += n / money[i];
            n -= n / money[i] * money[i];
        }
        System.out.println(sum);
    }
}
