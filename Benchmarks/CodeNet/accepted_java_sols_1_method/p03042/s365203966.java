//https://atcoder.jp/contests/abc126/tasks/abc126_b

import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String pre = String.valueOf(S.charAt(0))+String.valueOf(S.charAt(1));
        String rear = String.valueOf(S.charAt(2))+String.valueOf(S.charAt(3));
        String ans;
        if (pre.equals("00") || Integer.parseInt(pre)>12){
            if (rear.equals("00") || Integer.parseInt(rear)>12){
                ans = "NA";
            } else {
                ans = "YYMM";
            }
        } else {
            if (rear.equals("00") || Integer.parseInt(rear)>12){
                ans = "MMYY";
            } else {
                ans = "AMBIGUOUS";
            }
        }
        System.out.println(ans);
    }
}