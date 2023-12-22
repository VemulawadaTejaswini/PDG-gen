import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;
        for(int i = 0;i < n;i++){
            int h = sc.nextInt();
            if(h >= k){res++;}
        }
        System.out.println(res);
    }
}
