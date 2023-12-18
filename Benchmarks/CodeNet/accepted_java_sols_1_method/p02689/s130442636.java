import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int m=kbd.nextInt();

   int[] A= new int[n+1];
   for(int i=1;i<=n;i++){
     A[i]=1;
   }
   int[] H= new int[n+1];
   for(int i=1;i<=n;i++){
     H[i]=kbd.nextInt();
   }
   for(int i=0;i<m;i++){
     int a=kbd.nextInt();
     int b=kbd.nextInt();
     if(H[a]>=H[b]){A[b]=0;}
     if(H[a]<=H[b]){A[a]=0;}
   }
   int c=0;
  for(int i=1;i<=n;i++){
   if(A[i]>0){
     c++;
   }
 }
   System.out.println(c);
 }
}
