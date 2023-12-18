import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String S = bf.readLine();
        int K = Integer.parseInt(bf.readLine());
        String s = S.substring(K-1, K);
        for(int i = 0; i < N; i++){
            String ss = S.substring(i, i+1);
            if(!ss.equals(s)){
                S = S.replace(ss, "*");
            }
        }
        System.out.println(S);
    }
}