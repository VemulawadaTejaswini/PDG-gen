//https://atcoder.jp/contests/abc106/tasks/abc106_c

import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String str = br.readLine();
        long K = Long.parseLong(str);
        if (K!=1){
            for (int i=0;i<S.length();i++){
                if (i==K-1 && String.valueOf(S.charAt(i)).equals("1")){
                    System.out.println(String.valueOf(S.charAt(i)));
                    break;
                }
                if (!String.valueOf(S.charAt(i)).equals("1")){
                    System.out.println(String.valueOf(S.charAt(i)));
                    break;
                }
            }
        } else {
            System.out.println(String.valueOf(S.charAt(0)));
        }
    }
}