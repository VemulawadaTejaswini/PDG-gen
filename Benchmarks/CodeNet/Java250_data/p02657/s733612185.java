import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
public class Main {
    public void sol(int a, int b){

            System.out.println(a*b);
    }
    Map<Long,Long> memo = new HashMap<>();
    static Map<Long, Long> cache;

    public static void main(String[] args)  throws IOException {
        // Use the Scanner class
        Main aka = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //int tot = Integer.parseInt(br.readLine());
        String[] ss = s.split(" ");
        aka.sol(Integer.parseInt(ss[0]),Integer.parseInt(ss[1]));
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
