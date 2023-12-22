import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            
            int blue_n = Integer.parseInt(br.readLine());
            ArrayList<String> blue_card = new ArrayList<String>();
            
            for(int i=0;i<blue_n;i++){
                blue_card.add(br.readLine());
                
            }
            
            
            
            int red_n = Integer.parseInt(br.readLine());
            ArrayList<String> red_card = new ArrayList<String>();
            
            for(int i=0;i<red_n;i++){
                red_card.add(br.readLine());
                
            }
            
            
            
            String str ="";
            int max=0;
            
            for(int i=0;i<blue_n;i++){
                
                int count_b=0;
                int count_r=0;
                
                str = blue_card.get(i);

                    
                for(int j=0;j<blue_n;j++){
                    if(blue_card.get(j).equals(str)){
                        count_b++;
                    }
                }
                
                
                for(int k=0;k<red_n;k++){
                    if(red_card.get(k).equals(str)){
                        count_r++;
                    }
                }
                
                
                if(count_b-count_r>max){
                max =count_b-count_r;
                }
            
            }
            
            
           System.out.println(max);
            
            

        }
    }
}