import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((n>=13)?b:(n>=6)?b/2:0);
    }
}
