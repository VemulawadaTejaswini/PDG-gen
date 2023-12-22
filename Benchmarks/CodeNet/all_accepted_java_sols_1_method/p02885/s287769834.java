import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        int n = yomi.nextInt();
        n = n-(yomi.nextInt()*2);
        if (n>=0) System.out.println(n);
        else System.out.println(0);
    }
}