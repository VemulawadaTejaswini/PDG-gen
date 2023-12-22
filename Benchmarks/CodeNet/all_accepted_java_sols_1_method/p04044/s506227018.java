import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = "";
        int n = in.nextInt();
        int l = in.nextInt();
        String [] str = new String[n];
        for (int i = 0; i < n; i++){
            str[i] = in.next();
        }
        Arrays.sort(str);
        for (int i = 0; i < n; i++){
            s += str[i];
        }
        System.out.println(s);
    }
}