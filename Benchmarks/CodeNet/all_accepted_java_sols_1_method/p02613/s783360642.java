import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException{
        // Solution sol = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> hm = new HashMap();
        while(t--!=0) {
            String s = br.readLine();
            hm.put(s,hm.getOrDefault(s, 0)+1);
        }
        String[] sarr = new String[]{"AC","WA","TLE","RE"};

        for(String x: sarr) {
            System.out.println(x+" x "+hm.getOrDefault(x,0));
        }


    }

    


    

}