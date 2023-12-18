import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
//给出两个数a,b 求出[a,b]中各位数字之和能整除原数的数的个数。
public class Main {

    int mod ;
    void solve(int x, int y) {
        //2x1+4x2 = y
        //x1+x2 = x
        //2*(x-i)+4*i = y
        //2*i = y-2*x;
        //(y-2*x)/2<=x
        if(y<2*x){
            System.out.println("No");
        }else if((y-(2*x))%2!=0){
            System.out.println("No");
        }else if((y-2*x)/2>x){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }


    public static void main(String[] args)  throws IOException {
        // Use the Scanner class

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]  s = br.readLine().split(" ");
        Main test = new Main();
//
//        int n = Integer.parseInt(s[0]);
//        int w = Integer.parseInt(s[1]);
//        int[] volumn = new int[n];
//        int[] values = new int[n];
//        for(int i=0;i<n;i++) {
//            s = br.readLine().split(" ");
//            volumn[i] = Integer.parseInt(s[0]);
//            values[i] = Integer.parseInt(s[1]);
//        }

        test.solve(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
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
