import java.util.*;
import java.io.*;
 
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int card = Integer.parseInt(br.readLine());    
        String[] str;
        int t=0;
        int h=0;
        for(int i=0; i<card; i++){
          
            str = br.readLine().split(" ");  
            String tarou = str[0];
            String hanako = str[1];

            int judge = tarou.compareTo(hanako);
             
            if(judge<0){        
                h += 3;   
            }else if(judge>0){  
                t += 3;   
            }else{              
                h += 1;   
                t += 1;
            }
        }
        System.out.println(t +" "+h);
    }
}