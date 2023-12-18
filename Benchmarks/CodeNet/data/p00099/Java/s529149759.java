


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 

 class Main{
             
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             while((line=br.readLine())!= null){if(line.isEmpty())break;
                String[] spli=line.split(" ");
                
                 int sanka=Integer.parseInt(spli[0]);
                 int ibe=Integer.parseInt(spli[1]);
                 SabaTable stab=new SabaTable(sanka);
                 for(int i=0; i<ibe;i++){
                     line=br.readLine();spli=line.split(" ");
                     int a=Integer.parseInt(spli[0]);
                     int b=Integer.parseInt(spli[1]);
                     //System.out.println("aa");
                     stab.vary(a, b);
                     stab.mostPrint();
                 }
                
                 
                 
             }
             
         }catch(Exception e){}         
     }
     
     
    
 }
class SabaTable{
    int tore[];
    SabaTable(int n){
        tore = new int[n];
    }
    void vary(int nth,int val){tore[nth-1]+=val;}
    void mostPrint(){
        int max=-1;int chmp=-1;
        for(int i=tore.length-1;i>=0;i--){
            if(max<=tore[i]){max=tore[i];chmp=i;}
        }
        System.out.println((chmp+1)+" "+max);
    }
}