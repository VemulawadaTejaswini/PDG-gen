import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum_days = 0;
        for (int i = 0; i<m;i++){
            sum_days += sc.nextInt();
        }
            int res = n - sum_days;        
        if(res<0){
            res = -1;
        }
        System.out.println(res);
    }
}