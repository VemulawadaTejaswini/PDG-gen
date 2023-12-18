

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     static int[][] kazoeage = new int[11][333];
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             func(0,0);
            while((line=br.readLine())!= null){if(line.isEmpty())break;
             String spl[] = line.split(" ");
             int n=Integer.parseInt(spl[0]), s = Integer.parseInt(spl[1]);
             cnt=0;
             
                System.out.println(kazoeage[n][s]);
            }br.close();
       
         }catch(Exception e){e.printStackTrace();}         
     }
     static int cnt=0;
     static ArrayList<Integer> usedInt = new ArrayList<Integer>();
     
     static int func( int dep, int sum){
         kazoeage[dep][sum]++;if(dep>=10){return 0;}
         for(int i=0; i<=9;i++){
             if(usedInt.contains(i)){continue;}
             usedInt.add(i);
             func(dep+1,sum+i*(dep+1));
             usedInt.remove(usedInt.indexOf(i));
         }
         return 0;         
     }
}
  