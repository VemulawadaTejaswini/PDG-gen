
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             
            while((line=br.readLine())!= null){if(line.isEmpty())break;
             String spl[] = line.split(" ");
             int n=Integer.parseInt(spl[0]), s = Integer.parseInt(spl[1]);
             cnt=0;
             func(s,n,1,0);
                System.out.println(cnt);
            }br.close();
       
         }catch(Exception e){e.printStackTrace();}         
     }
     static int cnt=0;
     static ArrayList<Integer> usedInt = new ArrayList<Integer>();
     static void func(int s, int n, int nowN, int sum){
         if(sum>s){return ;}
         if(nowN==n+1){if(sum==s){cnt++;} return;}
         for(int i=0; i<=9; i++){
             if(usedInt.contains(i)){continue;}
             usedInt.add(i); func(s,n,nowN+1,sum+i*nowN); usedInt.remove(usedInt.indexOf(i));
         }
         return ;
     }
}
  