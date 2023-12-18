import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] sl = str.split(" ");
        int N = Integer.parseInt(sl[0]);
        int K = Integer.parseInt(sl[1]);
        System.out.println(N-(K-1));
    }
}