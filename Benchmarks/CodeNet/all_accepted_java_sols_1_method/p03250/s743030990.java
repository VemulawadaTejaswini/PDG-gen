import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
 	public static void main (String[] args) {
     Scanner sc = new Scanner (System.in);
     int[] a = new int[3];
      a[0] = sc.nextInt();
      a[1] = sc.nextInt();
      a[2] = sc.nextInt();
      
      Arrays.sort(a);
      int num = a[2]*10+a[1]+a[0];
      System.out.println(num);
    }
}