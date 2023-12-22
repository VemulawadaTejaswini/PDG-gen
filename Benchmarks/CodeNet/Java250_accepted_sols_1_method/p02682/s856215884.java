import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        if (k<=a){
            ans = k;
        }
        else if(k<=(a+b)){
            ans = a;
        }
        else if (k>(a+b)){
            ans = a + ((k-(a+b))*-1);
        }
        System.out.println(ans);
    }
}