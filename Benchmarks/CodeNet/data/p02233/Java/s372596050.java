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
        System.out.println(Fib(n));

    }

    public int Fib(int n){
        if(n ==0 || n == 1){
            return 1;
        }else{
            return Fib(n-1)+Fib(n-2);
        }


    }


}