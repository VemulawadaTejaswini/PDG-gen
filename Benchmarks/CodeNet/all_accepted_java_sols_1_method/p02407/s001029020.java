import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int n = Integer.parseInt(str);
        
        str = br.readLine();
        String[] temp = str.split("\\s");
        int[] Suretu = new int[n];
        
        for(int i=0;i<n;i++){
            Suretu[i]=Integer.parseInt(temp[i]);
        }
        
        //Arrays.sort(Suretu);
        
        StringBuilder output = new StringBuilder();
        for(int i= n-1;i>=0;i--){
            if(i != 0){
            output.append(Suretu[i]);
            output.append(" ");
            }else{
            output.append(Suretu[i]);
            }
        }
        System.out.println(output.toString());
    }
}