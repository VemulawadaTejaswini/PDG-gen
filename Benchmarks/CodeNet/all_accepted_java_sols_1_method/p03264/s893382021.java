import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int half = k / 2;
        long ans = (k - half) * half;
        System.out.println(ans);
    }
}
