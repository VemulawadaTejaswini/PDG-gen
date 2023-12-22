import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        String ans = W>=S ? "unsafe":"safe";
        System.out.println(ans);
    }
}