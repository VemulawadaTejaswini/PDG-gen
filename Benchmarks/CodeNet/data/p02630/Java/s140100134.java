import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
//给出两个数a,b 求出[a,b]中各位数字之和能整除原数的数的个数。
public class Main {

    int mod ;
    //
    //int[][] dp = new int[1001][1001];
    void solve(int n, int q, int [] arr, int[][] ops) {
        Map<Integer,Integer> mp = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<n;i++){
            cnt+=arr[i];
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<q;i++){
            int a1 = ops[i][0];
            int b1 = ops[i][1];
            if(mp.containsKey(a1)){
                int get = mp.get(a1);
                cnt+=(b1-a1)*get;
                mp.put(b1,mp.getOrDefault(b1,0)+get);
            }

            System.out.println(cnt);
        }

    }



    public static void main(String[] args)  throws IOException {
        // Use the Scanner class

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]  s = br.readLine().split(" ");
        Main test = new Main();

        int n = Integer.parseInt(s[0]);
        s = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        int q = Integer.parseInt(s[0]);
        int[][] ops = new int[q][2];
        for(int i=0;i<q;i++){
            s = br.readLine().split(" ");
            ops[i][0] = Integer.parseInt(s[0]);
            ops[i][1] = Integer.parseInt(s[1]);
        }

        test.solve(n, q, arr, ops);
        //int tot = Integer.parseInt(br.readLine());


//        int i =1;
//        System.out.println();
//        while(tot>0){
//
//            String s = br.readLine();
//            String[] sr = s.split(" ");
//            List<Long> ls = new ArrayList<>();
//            for(String ss:sr){
//                ls.add(Long.parseLong(ss));
//            }
//            Main tt = new Main();
//            tt.sol(ls);
//            // String Buffer to store answer
//            StringBuffer sb = new StringBuffer();
////            Solution obj = new Solution();
////
////            System.out.println("Case #"+i+": "+obj.sol());
//            tot--;
//            i++;
//        }
    }

}
