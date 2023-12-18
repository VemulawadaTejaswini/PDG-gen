


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
    static int n=0;
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
            ArrayList<Double> xs= new ArrayList<Double>();
            ArrayList<Double> ys= new ArrayList<Double>();
            
             while((line=br.readLine())!=null){if(line.isEmpty())break;
                String spl[] = line.split(",");
                double x=Double.parseDouble(spl[0]);
                double y=Double.parseDouble(spl[1]);
                xs.add(x); ys.add(y);
             } br.close();
            double x0 = xs.get(0), y0=ys.get(0);
            double allS=0;
            for(int i=2;i<=xs.size()-1;i++){
                double x2=xs.get(i),y2=ys.get(i);
                double x1=xs.get(i-1),y1=ys.get(i-1);
                double a=Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0));
                double b=Math.sqrt((x2-x0)*(x2-x0)+(y2-y0)*(y2-y0));
                double c=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
                double z=(a+b+c)/2;
                double s=Math.sqrt(z*(z-a)*(z-b)*(z-c));
                allS+=s;
            }
             System.out.println(allS);
         }catch(Exception e){e.printStackTrace();}         
     }  
    static String _4keta(int n){
        if(n/10==0) return "   "+n;
        if(n/100==0) return "  "+n;
        if(n/1000==0) return " "+n;
        return n+"";
    }
     static int[] migisita(int[] inV){
         int nowX = inV[0], nowY=inV[1];
         int nexX = (nowX==n-1)? 0 : nowX+1;
         int nexY = (nowY==n-1)? 0 : nowY+1;
         return new int[]{nexX, nexY};         
     }
     static int[] hidarisita(int[] inV){
         int nowX = inV[0], nowY=inV[1];
         int nexX = (nowX==0)? n-1 : nowX-1;
         int nexY = (nowY==n-1)? 0 : nowY+1;
         return new int[]{nexX, nexY};         
     }
     
}
 