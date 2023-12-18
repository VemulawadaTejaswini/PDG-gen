import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int W = sc.nextInt();
   char[][] gr = new char[H][W];
   for(int i=0;i<H;i++)
   {
     gr[i] = sc.next().toCharArray();
   }
   char[][] gmap = new char[H+2][W+2];
   for(int i =0;i<H+2;i++) 
   {
     gmap[i][0]='.';
     gmap[i][W+1]='.';
   }
   for(int i =0;i<W+2;i++) 
   {
     gmap[0][i]='.';
     gmap[H+1][i]='.';
   }
   for(int i=0;i<H;i++)
   {
     for(int k =0;k<W;k++)
     {
       gmap[i+1][k+1]= gr[i][k];
     }
   }
   boolean flg = false;
   for(int i=0;i<H+2;i++)
   {
     for(int k=0;k<W+2;k++)
     {   
       if(gmap[i][k]=='#'&&gmap[i][k-1]=='.'&&gmap[i+1][k]=='.'&&gmap[i][k+1]=='.'&&gmap[i-1][k]=='.')
       {
         flg = true;
         break;
       }
     }
   }
   if(flg) System.out.println("No");
   else System.out.println("Yes");
 }
}