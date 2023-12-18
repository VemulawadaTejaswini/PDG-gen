import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] argst)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        while(str != null){
            String[] line = str.split("\\s");
            int H = Integer.parseInt(line[0]);
            int W = Integer.parseInt(line[1]);
            //System.out.println(H);
            //System.out.println(W);

            if(H !=0 && W != 0){
            String yoko = Wwrite(W);
            Hwrite(H,yoko);
            System.out.println("");
            str = br.readLine();
            }else{
                break;
            }
        }
    }

    public static String Wwrite(int W){
        StringBuilder buff = new StringBuilder();
        for(int i=0;i<W;i++){
            buff.append("#");
        }
        return buff.toString();
    }

    public static void Hwrite(int H,String yoko){
        for(int i=0;i<H;i++){
            System.out.println(yoko);
        }
    }
}