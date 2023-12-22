/*
  B - Good Distance
  D次元空間上にN個の点があります。
  i番目の点とj番目の点の距離が整数となるような
  組(i,j)(i<j)はいくつあるでしょうか？
 */

 import java.util.*;

 public class Main{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     while(sc.hasNext()){
       int n=sc.nextInt();
       int d=sc.nextInt();
       int x[][]=new int[n][d];

       for(int s=0;s<n;s++){
         for(int k=0;k<d;k++){
           x[s][k]=sc.nextInt();
         }
       }

       int count=0;
       int total=0;
       int ans=0;
       double ans2=0;

       for(int k=0;k<n-1;k++){
         for(int l=k+1;l<n;l++){
            total=0;
           for(int s=0;s<d;s++){
             total+=Math.pow(x[k][s]-x[l][s],2);
           }
           ans=(int)Math.sqrt(total);
           ans2=Math.sqrt(total);
           if(ans==ans2){
             count++;
           }
         }
       }


       System.out.println(count);
     }
   }
 }
