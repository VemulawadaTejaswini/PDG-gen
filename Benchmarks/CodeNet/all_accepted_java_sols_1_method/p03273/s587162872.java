import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int W = sc.nextInt();

   String[][] men = new String[H][W];
   
   String tmp = "";
   for(int i=0;i<H;i++)
   {
     tmp = sc.next();
     for(int k=0;k<W;k++)
     {
       men[i][k] = tmp.substring(k,k+1);       
     }
   }
   
   boolean[] tate = new boolean[H];
   boolean[] yoko = new boolean[W];
   
   for(int i = 0;i<H;i++)
   {
     tate[i]=false;
     for(int k = 0;k<W;k++)
     {
       if(men[i][k].equals("#")) 
       {
         tate[i]= true;
       	 break;
       }
     }
   }
   
   for(int i = 0;i<W;i++)
   {
     yoko[i]=false;
     for(int k = 0;k<H;k++)
     {
       if(men[k][i].equals("#")) 
       {
         yoko[i]= true;
       	 break;
       }
     }
   }
   
   String anstmp = "";
   for(int i=0;i<H;i++)
   {
     anstmp = "";
     for(int k=0;k<W;k++)
     {
       if(tate[i] && yoko[k]) anstmp+=men[i][k];       
     }
     if(!anstmp.equals("")) System.out.println(anstmp);
   }
   
 }
}