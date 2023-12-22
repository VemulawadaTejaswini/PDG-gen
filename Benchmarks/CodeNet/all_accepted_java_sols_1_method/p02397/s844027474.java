import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]){
                
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<3000;i++){
            try{
                String s=reader.readLine();
                StringTokenizer st = new StringTokenizer(s);
                
                String x=st.nextToken();
                String y=st.nextToken();
                
                int xn=Integer.parseInt(x);
                int yn=Integer.parseInt(y);
                
                if(xn==0&&yn==0){
                    break;
                }else if(xn>yn){
                    System.out.println(yn+" "+xn);
                }else{
                    System.out.println(xn+" "+yn);
                }
                
                
            }catch(IOException e){
                
            }

        }
    }
}