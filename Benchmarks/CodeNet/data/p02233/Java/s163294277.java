import java.util.Scanner;

/**
 * Author: zhang
 * Time: 8/12/2017
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n){
        if(n ==0 || n == 1){
            return 1;
        }else {
            int[] store ={1,1};
            int sum = 1;
            for (int i = 2; i < n; i++) {
                sum = store[0]+store[1];
                store[0] = store[1];
                store[1] = sum;
//                i++;

            }
            return store[0]+store[1];
        }
    }
}