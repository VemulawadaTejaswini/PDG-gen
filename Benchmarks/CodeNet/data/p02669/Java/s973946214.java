import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   long ans=0;
   boolean[] P= new boolean[n*n+1];

    for(int i=1;i<=n;i++){
      P[i]=true;
      P[n*i]=true;
      P[n*n-n+i]=true;
      P[n*(i-1)+1]=true;
   }
     int[] count=new int[4];
     int i;
     for(int j=0;j<n*n;j++){
      i=kbd.nextInt();
      int y=i;
     while(i>=n){
       if(P[i-n]==false){
         count[0]++;
         i=i-n;
       }
     }
     i=y;
     while(i<=n*n){
       if(P[i+n]==false){
         count[1]++;
         i=i+n;
       }
     }
     i=y;
     int x=i/n;
     while(i<=x*n){
       if(P[i+1]==false){
         count[2]++;
         i=i+1;
       }
     }
     i=y;
     while(i>n*(x-1)){
       if(P[i-1]==false){
         count[3]++;
         i=i-1;
       }
     }

     int min=500;
     int u=0;
     for(int k=0;k<n;k++){
      min=Math.min(min,count[k]);
     }

    P[i]=true;
    ans=ans+min;
 }
 System.out.println(ans);
}
}