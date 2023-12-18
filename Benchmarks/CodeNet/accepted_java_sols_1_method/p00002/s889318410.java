import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String st = br.readLine();
            while(st!=null){
            String[] s = st.split(" ",0);
            int valuelength = String.valueOf(Integer.parseInt(s[0])+Integer.parseInt(s[1])).length();
            System.out.println(valuelength);
            st = br.readLine();
            }
        }catch (Exception ex){
            System.exit(0);
        }
    }
}