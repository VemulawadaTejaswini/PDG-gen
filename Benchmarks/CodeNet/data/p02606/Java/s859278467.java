import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int d = scan.nextInt();
        if(l % d == 0 || r % d == 0) System.out.println((r - l) / d + 1);
        else System.out.println((r - l) / d);
        scan.close();
    }
}
