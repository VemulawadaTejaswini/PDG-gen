import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String st = br.readLine();
            String[] s = st.split(" ",0);
            int a = Integer.parseInt(s[0]);
            int  b = Integer.parseInt(s[2]);
             String plus = "+";
             String sub = "-";
            if(s[1].equals(plus)){
                int c = a+b;
                System.out.println(c);
            }else if(s[1].equals(sub)){
                int c = a-b;
                System.out.println(c);
            }
        }catch(Exception ex){
            System.exit(0);
        }
    }
}