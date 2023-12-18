import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();

        int dx = bx-ax;
        int dy = by-ay;

        System.out.print((bx + (-1)*dy) + " " + (by + dx)+ " ");

        int cx = (bx + (-1)*dy);
        int cy = (by + dx);

        int tmp = dx;
        dx = (-1)*dy;
        dy = tmp;


        System.out.print((cx+(-1)*dy) + " " + (cy + dx));
        System.out.println();


    }
}