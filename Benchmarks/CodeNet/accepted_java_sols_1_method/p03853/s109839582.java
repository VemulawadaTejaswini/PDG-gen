import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int H = sc.nextInt();
   int W = sc.nextInt();
   char[][] ccc = new char[H][W];
   for(int i =0;i<H;i++)
   {
     ccc[i] = sc.next().toCharArray();
   }
   for(int i=0;i<H;i++)
   {
     for(int k=0;k<W;k++) System.out.print(ccc[i][k]);
     System.out.println();
     for(int k=0;k<W;k++) System.out.print(ccc[i][k]);
     System.out.println();
   }
 }
}