import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a, v, b, w;
        a = scn.nextInt();
        v = scn.nextInt();
        b = scn.nextInt();
        w = scn.nextInt();
        long t = scn.nextLong();

        long dis = Math.abs(b - a);
        long ch = v - w;
        if (ch <= 0) {
            System.out.println("NO");
        } else {
            if (dis <= (ch * t)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        scn.close();

    }

}