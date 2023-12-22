import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int A,B,T;
        String[] s = str.split(" ");
        A = Integer.parseInt(s[0]);
        B = Integer.parseInt(s[1]);
        T = Integer.parseInt(s[2]);
        System.out.println((T/A)*B);
    }
}