import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
public class Main {
    BigDecimal asd = new BigDecimal(1000000000);
    public void sol(String s,long j) {
        asd= asd.multiply(asd);
        BigDecimal ans = new BigDecimal(1);
        boolean ret = false;
        String[] ss = s.split(" ");
        BigDecimal[] arr = new BigDecimal[ss.length];
        for (int i=0;i<ss.length;i++) {
            arr[i] = BigDecimal.valueOf(Long.parseLong(ss[i]));
            if (arr[i] == BigDecimal.ZERO) {
                System.out.println("0");
                return;
            }
        }
        for(BigDecimal k:arr){
            ans = ans.multiply(k);
            if(ans.compareTo(asd)>0){
                System.out.println("-1");
                return;
            }
        }
        System.out.println(ans);


    }

    public static void main(String[] args)  throws IOException {
        // Use the Scanner class
        Main aka = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        String s = br.readLine();
        //int tot = Integer.parseInt(br.readLine());

        aka.sol(s,num);
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
