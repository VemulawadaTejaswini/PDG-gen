import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();

        System.out.println((n % 500) <= a ? "Yes" : "No");
    }
}
