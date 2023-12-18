import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        try{
        String line=reader.readLine();
        int n=Integer.parseInt(line);
        System.out.println(n*n*n);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
