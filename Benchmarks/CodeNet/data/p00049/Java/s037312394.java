
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        int[] blood = new int[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buf;
        while((buf = br.readLine())!=null){
            String b = buf.split(",")[1];
                if("A".equals(b))
                    blood[0]++;
                else if("B".equals(b))
                    blood[1]++;
                else if("AB".equals(b))
                    blood[2]++;
                else
                    blood[3]++;
        }
        for(int i =0; i<blood.length;i++){
            System.out.println(blood[i]);
        }
    }
}