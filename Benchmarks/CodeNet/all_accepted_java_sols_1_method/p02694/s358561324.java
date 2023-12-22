import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        sc.close();
        long money = 100;
        int cnt = 0;
        while (money < x) {
            cnt++;
            money = money + (long) Math.floor(money * 0.01);
        }
        System.out.println(cnt);   
    }
}