
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;
 

public class Main{
          
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             TreeMap<Integer,Integer> tm_last = new TreeMap<Integer,Integer>();
            while((line=br.readLine())!= null){if(line.isEmpty())break;
                     String[] spl = line.split(",");
                     int n1 = Integer.parseInt(spl[0]),n2 = Integer.parseInt(spl[1]);
                     if(tm_last.containsKey(n1)){
                         tm_last.put(n1, 1+tm_last.get(n1));
                     }else{
                         tm_last.put(n1,1);
                     }
            }        
        TreeMap<Integer,Integer> tm_this = new TreeMap<Integer,Integer>();

            while((line=br.readLine())!= null){if(line.isEmpty())break;
                     String[] spl = line.split(",");
                     int n1 = Integer.parseInt(spl[0]),n2 = Integer.parseInt(spl[1]);
                     if(!tm_last.containsKey(n1)){continue;}
                     if(tm_this.containsKey(n1)){
                         tm_this.put(n1,1+tm_this.get(n1));
                     }else{
                         tm_this.put(n1,1);
                     }
            }
            br.close();
            for(int key : tm_this.keySet()){
                System.out.println(key+" "+(tm_last.get(key)+tm_this.get(key)));
            }
             
         }catch(Exception e){e.printStackTrace();}         
     }
     
}
  