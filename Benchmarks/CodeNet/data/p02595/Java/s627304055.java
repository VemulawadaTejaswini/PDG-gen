import java.util.*;

public class main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt(), count  = 0;
        while (n-->0){
            int a = sc.nextInt(), b = sc.nextInt();
            if((float)Math.sqrt(Math.abs(a*a)+Math.abs(b*b)) <= 5){
                count++;
            }
        }
        System.out.println(count);
    }
}
