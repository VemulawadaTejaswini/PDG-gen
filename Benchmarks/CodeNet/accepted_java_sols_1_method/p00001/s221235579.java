import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a);
        for (int i=9; i>6; i--) {
            System.out.printf("%d\n",a[i]);
        }
    }
}

