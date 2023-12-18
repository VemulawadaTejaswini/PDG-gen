
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[] A = new int[50];

    public static void main(String[] args) throws IOException{

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] m = new int[q];
        for(int i = 0; i < q; i++){
            m[i] = sc.nextInt();
        }

        // ??????
        for(int i = 0; i < q; i++){
            if(solve(i, m[1])) System.out.println("yes");
            else System.out.println("no");
        }

    }

    public static boolean solve(int i, int m){
        if(m == 0) return true;
        if(i >= n) return false;
        return solve(i + 1, m) || solve(i + 1, m - A[i]);
    }

}