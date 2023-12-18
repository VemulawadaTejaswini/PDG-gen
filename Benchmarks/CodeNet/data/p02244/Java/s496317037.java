import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        char[][] T = new char[8][8];
        Point[] Q = new Point[8];
        int[] cols = new int[8];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 8; i++) {
            cols[i] = i;
            Arrays.fill(T[i], '.');
        }
        for(int i = 0; i < k; i++) T[sc.nextInt()][sc.nextInt()] = 'Q';
        label:
        do {
            int t = 0;
            for(int i = 0; i < 8; i++) if(T[i][cols[i]] == 'Q') t++;
            if(t != k) continue label;
            for(int i = 0; i < 8; i++) Q[i] = new Point(cols[i], i);
            for(int i = 0; i < 7; i++) {
                for(int j = i+1; j < 8; j++) {
                    if(Q[i].x == Q[j].x || Q[i].y == Q[j].y ||
                       Math.abs(Q[i].x - Q[j].x) == Math.abs(Q[i].y - Q[j].y)) {
                        continue label;
                    }
                }
            }
            for(Point q : Q) T[q.y][q.x] = 'Q';
            for(char[] r : T) System.out.println(String.valueOf(r));
            break;
        } while(nextPermutation(cols));
    }
    public static boolean nextPermutation(int[] array) {
        int num = array.length;
        for(int i = num - 2; i >= 0; i--) {
            if(array[i] < array[i + 1]) {
                int j = num;
                do {
                    j--;
                } while(array[i] > array[j]);
                swap(array, i , j);
                Arrays.sort(array, i + 1, num);

                return true;
            }
            if(i == 0) {
                reverse(array);
            }
        }
        return false;
    }
    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    public static void reverse(int[] array) {
        int num = array.length;
        for(int i = 0; i < num / 2; i++) {
            swap(array, i, num - i - 1);
        }
    }
    public static void test(int[] arr) {
        swap(arr, 1, 3);
        reverse(arr);
    }
}

