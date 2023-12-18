


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String order;
            while((order=br.readLine())!=null){
                String[] splited = order.split(" ");
                int a4[] = new int[4];
                for(int i=0;i<4;i++)a4[i]=Integer.parseInt(splited[i]);
                splited = br.readLine().split(" ");
                int b4[] = new int[4];
                for(int i=0;i<4;i++)b4[i]=Integer.parseInt(splited[i]);
                int hit=0,blow=0;
                for(int i=0; i<4;i++){
                    int a = a4[i];
                    for(int j=0;j<4;j++){
                        if(a==b4[j]) {if(i==j) hit++; else blow++; break;}
                    }
                }
                System.out.println(hit+" "+blow);

            }
            
        }catch(Exception e){e.printStackTrace();}
    }
}