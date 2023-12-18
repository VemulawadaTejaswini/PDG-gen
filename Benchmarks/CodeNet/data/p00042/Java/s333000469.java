

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
 

 class Main{
      static Stack<takara>stT=new Stack<takara>();
      static takara[] takaras;
      static int w , n;
      static int vesW,vesV;
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line; int _case=0;
             while((line=br.readLine())!= null){
                 stT.clear();
                 w=Integer.parseInt(line);if(w==0)break;
                 n=Integer.parseInt(br.readLine());_case++;
                 takaras = new takara[n];
                 for(int i=0;i<n;i++){line=br.readLine();
                    String[] split= line.split(",");
                    int wei_t=Integer.parseInt(split[1]);int val_t=Integer.parseInt(split[0]);
                     takara t=new takara(wei_t, val_t);   takaras[i]=t;
                 }//fin.setup
                 vesW=w;vesV=0;cal(0);
                 System.out.println("case "+_case+":");
                 System.out.println(vesV);System.out.println(vesW);
             }
             br.close();
         }catch(Exception e){}         
     }
     static void cal(int count){
         //System.out.print("cou"+count+" ");takaras[count].printt();System.out.println(" w"+totalW()+",v"+totalV());
         if(totalW()>w)return;
         if(totalV()>vesV){//System.out.println("bestV_over");for(takara t:stT)t.printt();System.out.println("");
             vesV=totalV();vesW=totalW();}
         else if(totalV()==vesV){//System.out.println("bestV");for(takara t:stT)t.printt();System.out.println("");
             if(totalW()<vesW)vesW=totalW();}
         if(n==count)return;
         stT.add(takaras[count]);cal(count+1);stT.pop();
         cal(count+1);
     }
     
     static int totalW(){int tw=0;for(takara t:stT)tw+=t.wei;return tw;}
     static int totalV(){int tw=0;for(takara t:stT)tw+=t.val;return tw;}
    
 }

class takara{
    int wei;int val;
    takara(int w,int v){this.wei=w;this.val=v;}
    void printt(){System.out.println("w"+wei+" v"+val);}
}