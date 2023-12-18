


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            int block[]=new int[64];
            while((line=br.readLine())!=null){  //if(line.equals(""))break;
                for(int j=0;j<8;j++)block[j]=Integer.parseInt(line.charAt(j)+"");
                for(int i=1;i<8;i++){
                    line=br.readLine();
                    for(int j=0;j<8;j++)block[j+i*8]=Integer.parseInt(line.charAt(j)+"");
                }
                System.out.println(detect(block));
                if(br.readLine()==null)break;
            }
        }catch(Exception e){e.printStackTrace();}        
    }
    static String detect(int[] block){
        ArrayList<Integer>ones = new ArrayList<Integer>();
        for(int i=0; i<64;i++) if(block[i]==1) ones.add(i);
        if(ones.get(3)-ones.get(0)==3)return "C";
        if(ones.get(3)-ones.get(0)==24)return "B";
        if(ones.get(3)-ones.get(0)==1+8)return "A";
        if(ones.get(3)-ones.get(0)==15)return "D";
        if(ones.get(3)-ones.get(0)==10)return "E";
        if(ones.get(3)-ones.get(0)==17)return "F";
        if(ones.get(3)-ones.get(0)==7)return "G";
        
        return null;
    }
}