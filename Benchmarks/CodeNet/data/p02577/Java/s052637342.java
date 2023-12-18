import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int total = 0;
        for (int i = 0; i < num.length(); i++) {
            total += Integer.parseInt(Character.toString(num.charAt(i)));
        }
        if (total % 9 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
