import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();

        if(a > b){
            System.out.println(0);
        }else if(n == 1){
            if(a == b){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }else{
            System.out.println((b - a) * (n - 2) + 1);
        }
    }
}