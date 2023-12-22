import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
//给出两个数a,b 求出[a,b]中各位数字之和能整除原数的数的个数。
public class Main {

    int mod ;
    void solve(int v, int[] arr) {
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int add = 0;
        while(true){
            if(!set.contains(v-add)){
                System.out.println((v-add));
                return;
            }else if(!set.contains(v+add)){
                System.out.println((v+add));
                return;
            }
            add++;
        }

    }


    public static void main(String[] args)  throws IOException {
        // Use the Scanner class

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]  s = br.readLine().split(" ");
        Main test = new Main();

        int n = Integer.parseInt(s[0]);
        int len = Integer.parseInt(s[1]);
        int[] arr = new int[len];
        s = br.readLine().split(" ");
        for(int i=0;i<len;i++) {
           arr[i] = Integer.parseInt(s[i]);

        }

        test.solve(n, arr);
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
