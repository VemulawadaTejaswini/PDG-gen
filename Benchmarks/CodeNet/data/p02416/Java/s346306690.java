import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        while(true) {
            int num = sc.nextInt();
            if(num==0)break;
            sum += num;
        }
        System.out.print(sum);
    }
}