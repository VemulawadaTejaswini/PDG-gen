import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int Z = scan.nextInt();
        //N * Y + (N+1) * Z <= X
        //(Y+Z)N <= X - Z
        // N <= (X-Z)/(Y+Z)
        long answer = (X-Z)/(Y+Z);
        System.out.println(answer);
    }
}
