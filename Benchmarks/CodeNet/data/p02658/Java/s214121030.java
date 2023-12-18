import java.util.*;

public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long ans = 1;
    long[] array = new long[n];
    boolean flag = false;
   // String bin = Long.toBinaryString(1000000000000000000L);
   // System.out.println(1000000000000000000L);
   // System.out.println(bin);
   for(int i=0; i<n; i++){
     long num = sc.nextLong();
     if(ans>1000000000000000000L/num && num!=0){
       flag = true;
     }else{
       ans *= num;
     }
     if(num==0){
       flag = false;
     }
   }

   if(flag){
     System.out.println("-1");
   }else{
     System.out.println(ans);
   }

  }
}