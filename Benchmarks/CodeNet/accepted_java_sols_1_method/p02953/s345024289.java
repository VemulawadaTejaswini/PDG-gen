import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  N = sc.nextInt();
     int[] H = new int[N];
     int i,delta;
     boolean flag=true;
     for(i=0;i<N;i++){
       H[i]=sc.nextInt();
     }
     for(i=0;i<N-1;i++){
       delta=H[N-2-i]-H[N-1-i];
       if(delta>=2){
         flag=false;
         break;
       }else if(delta==1){
         H[N-2-i]--;
       }
     }
     if(flag){
       System.out.println("Yes");
     }else{
       System.out.println("No");
     }
   }
}
