import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args){

        long n = Long.parseLong(read());
        String str = read();
        String[] stra = str.split(" ", 0);
        long result = 1;
        int aa;
        for(int i=0; i<n; i++){
            if((aa = Long.parseLong(stra[i]))==0){
                System.out.println("0");
                return;
            }else{
                result*=aa;
            }
            if(result > Long.parseLong(String.valueOf(Math.pow(10, 18))));
        }

    }

    public static String read(){
        String line="";
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            line = reader.readLine();
        }catch(IOException e){}
        
        return line;
    }

}