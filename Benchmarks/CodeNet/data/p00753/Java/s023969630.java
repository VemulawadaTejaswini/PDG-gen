
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Reopard on 2014/06/04.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        int n, count;
        boolean[] prime = new boolean[300000];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 0; i < prime.length; i++){
            if(prime[i]){
                for(int j = i + i; j < prime.length; j += i) prime[j] = false;
            }
        }
        while((n = sc.nextInt()) != 0){
            count = 0;
            for(int i = n + 1; i <= 2*n; i++)
                if(prime[i]) count++;
            System.out.println(count);
        }
    }
}