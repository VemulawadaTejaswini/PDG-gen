import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
                new InputStreamReader (System.in));
        String line=br.readLine();
        String[] str = line.split(" ");
        int a=Integer.parseInt(str[0]);
       
        System.out.println( a / 3600 ":" a % 60 ":"  a % 3600);
    }
}