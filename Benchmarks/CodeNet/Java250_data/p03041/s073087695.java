import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        char m = s.charAt(k-1);

        System.out.println(s.substring(0,k-1)+Character.toLowerCase(m)+s.substring(k));
    }
}
