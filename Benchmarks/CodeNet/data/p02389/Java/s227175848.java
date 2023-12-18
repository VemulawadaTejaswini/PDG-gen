import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] str2 = str.split(" ",1);
        int x =  Integer.valueOf(str[0]);
        int y =  Integer.valueOf(str[1]);
        System.out.println(x*y + " "+ 2*(x+y));
        }
}