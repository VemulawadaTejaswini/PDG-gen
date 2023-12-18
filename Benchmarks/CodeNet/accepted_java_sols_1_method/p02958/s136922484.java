import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = 0;
        for(int n=1; n<=N; n++){
            if(sc.nextInt()!=n) d++;
        }
        System.out.println(d<=2 ? "YES" : "NO");
    }
}