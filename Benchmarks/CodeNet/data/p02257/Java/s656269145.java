import java.util.Scanner;

public class Main {
    public static int MAX = 100000;
    public static boolean isPrime(int num){
        if(num < 2)
            return false;
        if(num == 2)
            return true;
        if(num % 2 ==0)
            return false;
        for(int i = 3;i * i <= num;i += 2){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        int count = 0;
        int[] A = new int[MAX];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0;i < n;i ++)
            A[i] = sc.nextInt();
        for(int j = 0;j < n;j ++){
            boolean flag = isPrime(A[j]);
            if(flag)
                count ++;
        }
        System.out.println(count);
    }
}
