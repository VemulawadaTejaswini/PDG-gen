import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int count = 0;
        for(int i=1; i<=n; i++) {
            int num = 0;
            int m = i;
            while(m > 0) {
                num += m % 10;
                m /= 10;
            }
            if(num >= a && num <= b) count += i;
        }
        System.out.println(count);
    }  
}