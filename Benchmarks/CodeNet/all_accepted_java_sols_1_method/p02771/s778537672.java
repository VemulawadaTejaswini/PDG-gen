import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int s = (a==b?1:0) + (b==c?1:0) + (c==a?1:0);
        System.out.println(s==1?"Yes":"No");
    }
}
