
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             
            while((line=br.readLine())!= null){if(line.isEmpty())break;
               int siseki = Integer.parseInt(line);if(siseki==0)break;
               line=br.readLine();
               int mitikazu = Integer.parseInt(line);
               ArrayList<miti> mitiLis=new ArrayList<miti>();
               for(int i=0; i<mitikazu; i++){
                   line=br.readLine();String[] spl=line.split(",");
                   int a=Integer.parseInt(spl[0]),b=Integer.parseInt(spl[1]),
                           kyori=Integer.parseInt(spl[2]);
                   mitiLis.add(new miti(a,b,kyori/100-1));
               }
                System.out.println(chochin(mitiLis,mitikazu,siseki));
            }br.close();
         }catch(Exception e){e.printStackTrace();}         
     }  
     static int chochin(ArrayList<miti> mitiL, int mitiN, int kyotenN){
         int min = 3000000;
         boolean cover[] = new boolean[kyotenN];
         for(int i=0; i<Math.pow(2, mitiN);i++){
             cover= new boolean[kyotenN];
             int i_copy=i;
             int choN=0;
             for(int mitiC=0; mitiC < mitiN; mitiC++){
                 if(i_copy%2==1){//selected
                     cover[mitiL.get(mitiC).start]=true;
                     cover[mitiL.get(mitiC).end]=true;
                     choN+=mitiL.get(mitiC).tyotinN;
                 }
                 i_copy /=2;
             }
             if(allCover(cover)){if(min>choN)min=choN;}
             
         } 
         return min;
     }
     static boolean allCover(boolean[] bools){
         boolean bool = true;
         for(int i=0; i<bools.length; i++){
             bool = bool&&bools[i];
         }return bool;
     }
}
  class miti{
      int start;
      int end;
      int tyotinN;
      miti(int s, int e, int tyotin){
          this.start=s; this.end=e; this.tyotinN=tyotin;
      }
  }