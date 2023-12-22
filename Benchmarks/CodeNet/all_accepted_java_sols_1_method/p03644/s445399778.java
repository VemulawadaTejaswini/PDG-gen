import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = (int) (Math.log10(n) / Math.log10(2));
        System.out.println((int) Math.pow(2,n));
        sc.close();
    }
}