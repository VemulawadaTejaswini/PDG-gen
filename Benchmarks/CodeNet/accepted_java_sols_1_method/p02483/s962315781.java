import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a2,b2,c2;
        if(a<b&&a<c)
        {
            a2 = a;
            b2 = Math.min(b,c);
            c2 = Math.max(b,c);

        }
        else if(b<a&&b<c)
        {
            a2 = b;
            b2 = Math.min(a,c);
            c2 = Math.max(a,c);

        }
        else
        {
            a2 = c;
            b2 = Math.min(b,a);
            c2 = Math.max(b,a);

        }
        System.out.printf("%d %d %d\n",a2,b2,c2);
    }
}