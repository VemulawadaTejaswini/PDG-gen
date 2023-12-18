import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; (str = br.readLine()) != null; i++)
            {
             if (str.equals("0")){
             break;}
             sb.append(str);
            }  