

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int trees = sc.nextInt();
        int inspector = sc.nextInt();
        int a = 2*inspector + 1;
        int ans = 0;
        if (trees % a == 0) {
            ans = trees /a;
        } else {
            ans = (trees/a) + 1;
        }
        
        System.out.print(ans);
    }
}