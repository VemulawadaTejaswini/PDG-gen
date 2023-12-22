import java.util.*;

class Main{
    
   public static void main(String a[]) throws java.io.IOException{
       Scanner scan =new Scanner (System.in);
       int [] bType ={0,0,0,0};
       scan.useDelimiter("\\d*,|\\n\\d*,|\\n");
       while(scan.hasNext()){
           String blood = scan.next();
        if(blood.compareTo("A")==0) 
            bType[0]++;
        else if(blood.compareTo("B")==0)
            bType[1]++;
        else if(blood.compareTo("O")==0)
            bType[3]++;
        else 
            bType[2]++;
           }
      
           for(int i=0;i<4;i++)
               System.out.println(bType[i]);
   }
}