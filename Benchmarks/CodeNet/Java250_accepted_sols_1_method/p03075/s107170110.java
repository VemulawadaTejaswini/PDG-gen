import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int[] arr = {a,b,c,d,e};
        Arrays.sort(arr);

        if ((e-a)<=f)
            System.out.println("Yay!");
        else
            System.out.println(":(");
    }
}
