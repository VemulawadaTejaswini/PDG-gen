import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long V = sc.nextLong();
        long B = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
        sc.close();

        if(W*T -V*T + Math.abs(B -A) <= 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}