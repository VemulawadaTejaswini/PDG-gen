import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
         
        int[] p = new int[3];
        int[] j = new int[2];
        p[0] = stdIn.nextInt();
        p[1] = stdIn.nextInt();
        p[2] = stdIn.nextInt();
        j[0] = stdIn.nextInt();
        j[1] = stdIn.nextInt();
        Arrays.sort(p);
        Arrays.sort(j);
        System.out.println(p[0]+j[0]-50);
    }
}