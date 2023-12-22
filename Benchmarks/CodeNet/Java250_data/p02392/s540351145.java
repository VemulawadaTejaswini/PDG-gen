import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        try{
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String s=reader.readLine();
            StringTokenizer st=new StringTokenizer(s," ");
            
            String a=st.nextToken();
            String b=st.nextToken();
            String c=st.nextToken();
            
            int an=Integer.parseInt(a);
            int bn=Integer.parseInt(b);
            int cn=Integer.parseInt(c);
            
            if(an<bn && bn<cn){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }catch(IOException e){
            System.out.println(e);
        }
    }
}