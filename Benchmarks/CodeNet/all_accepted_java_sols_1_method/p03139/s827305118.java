import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int min = 0;

        if ((a + b) >= n)
            min = (a + b) - n;

        int max = a < b ? a : b;
        System.out.println(max + " " + min);
    }        
}