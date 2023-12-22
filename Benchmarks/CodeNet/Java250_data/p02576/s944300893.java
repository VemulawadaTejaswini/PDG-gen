import java.util.*;

class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        
        int result = n / x;
        int judge = n % x;
        if (judge != 0) {
            result++;
        } 
        int answer = result * t;
        
        System.out.println(answer);
    }
}