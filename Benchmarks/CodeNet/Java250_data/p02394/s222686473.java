import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        try{
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String s=reader.readLine();
            StringTokenizer st=new StringTokenizer(s," ");
            
            String W=st.nextToken();
            String H=st.nextToken();
            String x=st.nextToken();
            String y=st.nextToken();
            String r=st.nextToken();
            
            int Wn=Integer.parseInt(W);
            int Hn=Integer.parseInt(H);
            int xn=Integer.parseInt(x);
            int yn=Integer.parseInt(y);
            int rn=Integer.parseInt(r);
            
            if((xn-rn)>=0 && (xn+rn)<=Wn && (yn-rn)>=0 && (yn+rn)<=Hn){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}