import java.util.Scanner;

class public Main{
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int[] h,m,s;
      h　= new int[6];
      m　= new int[6];
      s　= new int[6];
      for(int i=0;i<6;i++){
         h[i] = scan.next();
         m[i] = scan.next();
         s[i] = scan.next();
      }
      for(int i=1;i<6;i+=2){
         if((s[i]-=s[i-1])<0){s[i]=60-s[i];m[i]-=1;}
         if((m[i]-=m[i-1])<0){m[i]=60-b[i];h[i]-=1;}
         h[i]-=h[i-1];
      }
      for(int i=1;i<6;i+=2){
      System.out.println(h[i]+" "+m[i]+" "+s[i]);
      }
   }
}