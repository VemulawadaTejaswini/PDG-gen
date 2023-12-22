import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        str = br.readLine();
        long ans = 0;
        for (String s:str.split(" ")){
            ans += Long.parseLong(s);
        }
        System.out.println(ans-N);
    }
}