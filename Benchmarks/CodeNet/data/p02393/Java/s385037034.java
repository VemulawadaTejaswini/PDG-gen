import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] n = new int[3];
        int n[0] = in.nextInt();
        int n[1] = in.nextInt();
        int n[2] = in.nextInt();

        Arrays.sort(n);

        for(int i=0; i<n.length; i++)
        	System.out.print(n[i] + " ");
        System.out.println();
    }
}