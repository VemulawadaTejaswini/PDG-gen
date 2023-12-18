import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        for(int i=a; i<=b; i++) {
            if(c%i == 0) ans++;
        }
        
        System.out.println(ans);

    }
}

