//https://atcoder.jp/contests/abc106/tasks/abc106_c

import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String str = br.readLine();
        long K = Long.parseLong(str);
        String ans = "0";
        for (int i=0;i<K;i++){
            if (!String.valueOf(S.charAt(i)).equals("1")){
                ans = String.valueOf(S.charAt(i));
                break;
            }
        }
        if (ans.equals("0")){
            ans = "1";
        }
        System.out.println(ans);
    }
}