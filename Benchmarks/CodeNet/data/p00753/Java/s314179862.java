import java.util.Scanner;

/**
 * Created by Reopard on 2014/06/04.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        int n, count, tmp;
        int[] prime;
        while((n = sc.nextInt()) != 0){
            prime = new int[n];
            count = 0;
            tmp = 2;
            outer:
            for(int i = 0; i < prime.length; i++){
               // if(prime[i] == 1) continue;
                for(int j = 2; j < n + i; j++){
                    if(((n + 1) + i)%j == 0){
                        //for(int k = 0; i + k < prime.length; k += j) prime[i + k] = 1;
                        //tmp = j;
                        continue outer;
                    }
                }
                count++;
            }
            System.gc();
            System.out.println(count);
        }
    }
}