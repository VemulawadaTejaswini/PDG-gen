import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       String misnomer ="Hoshino";
       String rightName = "Hoshina";
       while(n-->0) {
           System.out.println(br.readLine().replaceAll(misnomer, rightName));
       }
    }
}
