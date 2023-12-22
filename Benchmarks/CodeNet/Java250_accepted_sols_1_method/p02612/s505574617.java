import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;

class Main {
    public static void main(String[] args){
        try {
            PrintWriter out=new PrintWriter(System.out,true);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            t=t%1000;
            t=1000-t;
            if(t==1000){
                t=0;
            }
            out.println(t);
            out.close();
        } catch (Exception e) {
            System.out.println("kkkk "+ e.getMessage());
        }

    }
}