import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try{
            String buf = br.readLine();
            String str[] = buf.split(" ", 0);

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            try{
                String s = br.readLine();
                String tmp[] = s.split(" ", 0);
                int k = Integer.parseInt(tmp[0]);

                if(b <= a && c <= a){
                    for(int i=0; i<k; i++){
                        a = a * 2;
                    }
                }
                else if(a <= b && c <= b){
                    for(int i=0; i<k; i++){
                        b = b * 2;
                    }
                }
                else{
                    for(int i=0; i<k; i++){
                        c = c * 2;
                    }
                }
                System.out.println(a+b+c);
            }
            catch(IOException e){
                System.out.println(e);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
