import java.io.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}