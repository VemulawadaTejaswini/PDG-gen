import java.util.*;
//import java.io.*;
//import java.util.stream.IntStream;

public class Main{
    static int minR = Integer.MAX_VALUE;
    static int maxL = 0;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        double ans = 0;
        
        for(double i=1;i<=n;i++){
            if(k/i>=1){
                int need = (int)Math.ceil(Math.log(k/i)/Math.log(2));
                ans += 1.0/n * Math.pow(0.5, need);
            }else{
                ans += 1.0/n;
            }
        }

        System.out.println(ans);

    }
}