import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Long N, sum = 0L;
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        for(int i = 1 ; i <= N ; i++)
        {
            sum += (((i%3 ==0) || (i%5==0))? 0 : i);
        }
        System.out.println(sum);
    }
}
