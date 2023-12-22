import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt() * 2 + 1;
        System.out.println(n % d == 0 ? n / d : n / d + 1);
        scan.close();
    }
}