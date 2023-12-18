import java.io.*;
public class Main {

    public static void main(String[] args)throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);

        String str=bf.readLine();
        str=str.replaceAll("apple","?????????");
        str=str.replaceAll("peach","??¢?????????");
        str=str.replaceAll("?????????","peach");
        str=str.replaceAll("??¢?????????","apple");
        System.out.println(str);
    }
}