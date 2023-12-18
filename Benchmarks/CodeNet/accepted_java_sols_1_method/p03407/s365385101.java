import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String s = (a+b >= c) ? "Yes": "No";
        System.out.println(s);
    }

}