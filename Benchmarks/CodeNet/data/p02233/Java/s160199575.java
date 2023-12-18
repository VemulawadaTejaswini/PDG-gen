import java.util.Scanner;
public class Main{
    public static int fib(int n, int num[], boolean data[]){
        if(!(data[n])){
            data[n] = true;
            num[n] = fib(n-1,num,data) + fib(n-2,num,data);
        }
        else
            return num[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        boolean data[] = new boolean[n];
        num[0] = num[1] = 1;
        data[0] = data[1] = true;
        System.out.println(fib(n,num,data));
    }
}
