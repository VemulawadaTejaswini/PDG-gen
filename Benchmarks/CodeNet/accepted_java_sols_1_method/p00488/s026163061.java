import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int[] p = new int[3];
        int[] j = new int[2];
        p[0] = sc.nextInt();
        p[1] = sc.nextInt();
        p[2] = sc.nextInt();
        j[0] = sc.nextInt();
        j[1] = sc.nextInt();
        Arrays.sort(p);
        Arrays.sort(j);
        System.out.println(p[0]+j[0]-50);
    }
}