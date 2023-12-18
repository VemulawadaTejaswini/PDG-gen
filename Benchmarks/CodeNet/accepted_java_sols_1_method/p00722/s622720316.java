import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by Reopard on 2014/06/05.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int a, d, n;
        boolean[] prime = new boolean[1000000];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 0; i < prime.length; i++)
            if(prime[i])
                for(int j = i + i; j < prime.length; j += i) prime[j] = false;
        while((a = sc.nextInt()) != 0 && (d = sc.nextInt()) != 0 && (n = sc.nextInt()) != 0){
            for(int i = a; i < prime.length; i += d){
                if(prime[i]) n--;
                if(n == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}