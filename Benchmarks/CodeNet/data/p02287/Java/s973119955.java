

import java.util.Scanner;

public class Main {

    public static int parent(int i) { return i / 2;}
    public static int left(int i)   { return 2 * i;}
    public static int right(int i)  { return 2 * i + 1;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, i;
        int MAX = 100000;
        int[] A = new int[MAX+1];
        H = sc.nextInt();

        for(i = 1; i <= H; i++) A[i] = sc.nextInt();

        for(i = 1; i <= H; i++) {
            System.out.print("node " + i + ": key = " + A[i] + ", ");
            if(parent(i) >= 1) System.out.print("parent key = " + A[parent(i)] + ", ");
            if(left(i) <= H) System.out.print("left key = " + A[left(i)] + ", ");
            if(right(i) <= H) System.out.print("right key = " + A[right(i)] + ", ");
            System.out.println();
        }
    }
}

