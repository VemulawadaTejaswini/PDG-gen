import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = "";
        s += n;
        int sum = 0;

        for (int i = 0; i<s.length(); i++){
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if (n%sum == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}