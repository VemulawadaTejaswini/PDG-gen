
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] a = new int[4];
        for(int i = 0 ; i < 4; i++){
            a[i] = n % 10;
            n /= 10;
        }
        System.out.println((a[0] == a[1] || a[1] == a[2] || a[2] == a[3]) ? "Bad" : "Good");
    }
}