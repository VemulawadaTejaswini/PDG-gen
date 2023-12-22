import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long i = n%k;
        if (i<=k-i){
            System.out.println(i);
        }else{
            System.out.println(k-i);
        }
    }

}