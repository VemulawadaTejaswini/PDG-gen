import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();

        long cu = 100;
        long ans = 0;

        while (cu<x){
            cu = cu + (cu/100);
            ans++;
        }
        System.out.println(ans);
    }
}