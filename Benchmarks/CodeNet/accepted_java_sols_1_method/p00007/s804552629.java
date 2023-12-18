import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int a = 100000;
            int n = Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++){
                 a = ((int)(a*1.05+999)/1000)*1000;
            }
            System.out.println(a);
        }catch(Exception ex){
            System.exit(0);
        }
    }
}