import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2 == 0 || n%5 == 0) System.out.println(-1);
        else{
        long num = 7%n, ans = 1;
        while(num != 0){
            ans++;
            num= num*10 + 7;
            num %= n;
        }
        System.out.println(ans);
        }

        sc.close();
    }
}