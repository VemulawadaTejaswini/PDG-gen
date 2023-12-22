import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int n = yomi.nextInt();
        int m = yomi.nextInt();
        System.out.println(n-m>0 ? "safe" : "unsafe");

    }
}