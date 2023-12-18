import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        String str;

        int taro =0;
        int hana =0;
        String[] temp = new String[2];

        while((str = br.readLine()) != null){
            int n = Integer.parseInt(str);
            for(int i=0;i<n;i++){
                str = br.readLine();
                temp = str.split("\\s");
                char taroc = temp[0].charAt(0);
                char hanac = temp[1].charAt(0);
                //System.out.println(taroc + " " + hanac);
                if(taroc > hanac){
                    taro+=3;
                }else if(taroc == hanac){
                    taro++;
                    hana++;
                }else{
                    hana +=3;
                }
            }
        }

        System.out.println(taro + " " + hana);
    }
}