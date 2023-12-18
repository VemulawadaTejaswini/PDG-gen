import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++){
            int w = in.nextInt();
            sum = sum + w;
        }
        
        System.out.println(sum/k + 1);
    }
}