import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  N = sc.nextInt();
     int i=0,j,ans=0;
     int Nhold=N;
     while(N>0){
       N=N/10;
       i++;
     }
     if(i%2==1){
       ans+=Nhold-Math.pow(10,i-1)+1;
       i--;
     }
     for(j=1;j<i;j+=2){
       ans+=Math.pow(10,j)-Math.pow(10,j-1);
     }
     System.out.println(ans);
   }
}
