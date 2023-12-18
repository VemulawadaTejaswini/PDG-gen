import java.io.*;

public class Main {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = br.readLine();
            if(str.length()<21){
                StringBuilder sb = new StringBuilder();
                sb.append("");
                for(int i = 0;i < str.length();i++){
                    sb.insert(0,str.charAt(i));
                }
                System.out.println(sb);
            }
        } catch (IOException ex) {
        }
        
    }
}