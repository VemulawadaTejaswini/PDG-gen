import java.io.*;

public class Main {
    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "abcdefghijklmnopqrstuvwxyz";
        int[] count = new int[1000];
        try{
        String x;
            x = reader.readLine();
            while(x != null){
            x = x.toLowerCase();
            for(int n =0; n < x.length() ; n++){
                if(x.charAt(n) == ' ' || x.charAt(n)=='.') continue;
                char z = x.charAt(n);
                count[ z ]++;
            }
            x = reader.readLine();
            }
        }catch(IOException e){
            System.out.println(e);
        }
        for(int i = 0 ; i<str.length(); i++){
            char y = str.charAt(i);
            System.out.println(str.charAt(i) +" : "+ count[y] );
        }
    }
}
