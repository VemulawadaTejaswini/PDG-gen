import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i<=n; i++){
            if ((i%3) != 0 && (i%5) != 0){
                ans += i;
            }
        }
        System.out.println(ans);
    }
}