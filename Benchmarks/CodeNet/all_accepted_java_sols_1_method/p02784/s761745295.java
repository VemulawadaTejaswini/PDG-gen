import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     
   int h = sc.nextInt();
   int  n =sc.nextInt();
   int s =0;
   int[] a = new int[n];
   for(int  i=0;i<n;++i){
       a[i]= sc.nextInt();
       s+=a[i];
   }
   if(s>=h){
       System.out.println("Yes");
   }else{
        System.out.println("No");
   }
    }
}