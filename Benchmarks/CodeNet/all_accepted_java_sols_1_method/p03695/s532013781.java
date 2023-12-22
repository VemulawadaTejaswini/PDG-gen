import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   
   boolean glay = false;
   boolean blown = false;
   boolean green = false;
   boolean sky = false;
   boolean blue = false;
   boolean yellow = false;
   boolean orange = false;
   boolean red = false;
   
   int tmp = 0;
   int allcount=0;
   for(int i = 0;i<N;i++) 
   {
     tmp = sc.nextInt();
     if(!glay&&tmp<400) glay = true;
     else if(!blown&&tmp>=400&&tmp<800) blown = true;
     else if(!green&&tmp>=800&&tmp<1200) green = true;
     else if(!sky&&tmp>=1200&&tmp<1600) sky = true;
     else if(!blue&&tmp>=1600&&tmp<2000) blue = true;
     else if(!yellow&&tmp>=2000&&tmp<2400) yellow = true;
     else if(!orange&&tmp>=2400&&tmp<2800) orange = true;
     else if(!red&&tmp>=2800&&tmp<3200) red = true;
     else if(tmp>=3200) allcount++;
   }
   int anslow =0;
   if(glay) anslow++;
   if(blown) anslow++;
   if(green) anslow++;
   if(sky) anslow++;
   if(blue) anslow++;
   if(yellow) anslow++;
   if(orange) anslow++;
   if(red) anslow++;
   
   int  anshigh = anslow+allcount;
   if(anslow==0) anslow++;
   System.out.println(anslow+" "+anshigh);
 }
}