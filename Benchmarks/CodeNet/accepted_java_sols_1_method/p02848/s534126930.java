import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            int next = (alp.indexOf(String.valueOf(s.charAt(i))) + n) % alp.length();
            sb.append(String.valueOf(alp.charAt(next)));
        }
        System.out.println(sb.toString());
    }
}

