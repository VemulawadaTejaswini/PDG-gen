import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        try{
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String str=reader.readLine();
            StringTokenizer st=new StringTokenizer(str," ");
            String a,b;
            a=st.nextToken();
            b=st.nextToken();
            
            int an=Integer.parseInt(a);
            int bn=Integer.parseInt(b);
            
            System.out.println(an*bn+" "+2*(an+bn));
        }catch(IOException e){
            System.out.println(e);
        }
    }
}