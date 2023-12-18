import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // w,h,x,y,r
        int w, h, x, y, r;

        w = scan.nextInt();
        h = scan.nextInt();
        x = scan.nextInt();
        y = scan.nextInt();
        r = scan.nextInt();

        if (x - r < 0 || y - r < 0)
            System.out.print("No\n");
        else if (x + r > w || y + r > h)
            System.out.print("No\n");
        else
            System.out.print("Yes\n");
    }
}
