import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
 
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=reader.readLine()) !=null){
            String[] t=s.split(" ");
            int c =Integer.parseInt(t[0])+Integer.parseInt(t[1]);;
            System.out.println(c);
        }   

    }
}