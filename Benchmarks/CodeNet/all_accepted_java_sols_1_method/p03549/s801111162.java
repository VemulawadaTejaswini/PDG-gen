import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        System.out.println((long)((1900*m+100*(n-m))*Math.pow(2,m)));
    }
}