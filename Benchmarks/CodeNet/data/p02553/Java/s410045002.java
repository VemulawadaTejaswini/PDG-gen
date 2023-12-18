import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
   long     a = scan.nextLong();
        long     b = scan.nextLong();
        long     c = scan.nextLong();
        long     d = scan.nextLong();

     long   p=Math.max(Math.max(a*c,b*d),Math.max(a*d,c*b));
        System.out.println(p);


    }
}
