import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p = 700;
        String s = sc.next();
        for (int i = 0;i < s.length();++i){
            if(s.charAt(i) == 'o')p += 100;
        }
        System.out.println(p);
    }
}