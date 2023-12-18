import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int p = Integer.parseInt(scan.next());
        int q = Integer.parseInt(scan.next());
        int r = Integer.parseInt(scan.next());
        System.out.println(Math.min(Math.min(p+q,q+r),r+p));
    }
}