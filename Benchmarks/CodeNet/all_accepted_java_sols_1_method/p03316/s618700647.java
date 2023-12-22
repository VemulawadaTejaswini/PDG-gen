import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long line = in.nextInt();//文字列の入力受付
        String s = String.valueOf(line);
        int p = 0;
        String sl[]= s.split("");
        for (int i = 0;i < sl.length ;i++ ){
            p = p + Integer.parseInt(sl[i]);
        }
        if (line % p == 0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}