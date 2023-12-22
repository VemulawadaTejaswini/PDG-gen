import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = Long.parseLong(sc.next());
        long count = 1;
        int i = 1;
        while(H > 1) {
            H /= 2;
            count += Math.pow(2, i);
            i++;
        }
        System.out.println(count);
    }
}