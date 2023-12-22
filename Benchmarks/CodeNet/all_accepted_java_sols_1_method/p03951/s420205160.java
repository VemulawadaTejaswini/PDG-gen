import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next(), t = sc.next();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (s.substring(n-i, n).equals(t.substring(0, i)))
                max = i;
        }
        System.out.println(n*2-max);
    }
}
