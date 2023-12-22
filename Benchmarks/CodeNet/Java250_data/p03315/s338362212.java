import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char a = n.charAt(0);
        char b = n.charAt(1);
        char c = n.charAt(2);
        char d = n.charAt(3);
        if (a == '+') {
            i++;
        }else{
            i--;
        }
        if (b == '+') {
            i++;
        }else{
            i--;
        }
        if (c == '+') {
            i++;
        }else{
            i--;
        }
        if (d == '+') {
            i++;
        }else{
            i--;
        }
        System.out.println(i);
    }
}