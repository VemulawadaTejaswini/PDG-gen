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
        String s = sc.next();
        int r = 0 ; 
        int w = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'R'){
                r++;
            }else{
                w++;
            }
        }
        int tc1 = 0;
        for(int i = 0 ; i < r ; i++){
            if(s.charAt(i) == 'W'){
                tc1++;
            }
        }
        int tc2 = 0;
        for(int i = r ; i < s.length() ; i++){
            if(s.charAt(i) =='R'){
                tc2++;
            }
        }
        int ans = Math.min(Math.min(r ,w) , Math.max(tc1 , tc2));
        System.out.println(ans);
        
    }
}