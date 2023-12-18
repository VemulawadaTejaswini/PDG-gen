import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int count = 0;
        for(int j = 0; j < n; j++) {
            if((j % 2 == 0) && (num[j] % 2 == 1))
            count++;
        }
        System.out.println(count);
    }
}