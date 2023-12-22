

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             boolean first=true;
            while((line=br.readLine())!= null){if(line.isEmpty())break;
                String[] spl = line.split(" ");
            
            int n1 = Integer.parseInt(spl[0]),n2 = Integer.parseInt(spl[1]);
                if(n1==0&&n2==0)break;
                    
            if(first){first=false;}else{System.out.println("");}
                
                ArrayList<Integer>al = new ArrayList<Integer>();
                for(int i=n1; i<=n2; i++){
                    if(i%400==0)al.add(i);
                    else if(i%4==0&&i%100!=0)al.add(i);
                }
                if(al.size()==0)System.out.println("NA");
                else for(int in : al){
                    System.out.println(in);
                }
            }br.close();
       
         }catch(Exception e){e.printStackTrace();}         
     }
     
}
  