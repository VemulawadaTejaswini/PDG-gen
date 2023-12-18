import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long count = 0;
        long i = 1;
        while(count < x) {
            count += i;
            if(count >= x) break;
            i++;
        }
        System.out.println(i);
    }   
}