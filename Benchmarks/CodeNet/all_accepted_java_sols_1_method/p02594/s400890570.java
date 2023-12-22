import java.io.*;
import java.util.*;
public class Main{
    public static void main(String []args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(br.readLine());
        // long [][] dp = new long[n+1][n+1];
        // ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        if(n >= 30){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}