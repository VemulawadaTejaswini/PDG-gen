import java.util.Arrays;
import java.util.Scanner;
   
public class C { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();

        int[] x = {a, b , c};

        Arrays.sort(x);
        System.out.println(x[0]+ " " + x[1] + " " + x[2]);
    }                                                                                                                                              
}