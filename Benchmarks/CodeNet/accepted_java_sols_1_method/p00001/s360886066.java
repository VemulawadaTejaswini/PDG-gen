import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] a){
        int[] values = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<10; i++)
            values[i] = scan.nextInt();
        Arrays.sort(values);
        for(int i=9; i>=7; i--)
            System.out.println(values[i]);
    }
}