import java.util.*;
public class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] pos = new int[n];
   for(int i=0;i<n;i++){
     pos[i]=sc.nextInt();
   }
   int min = Integer.MAX_VALUE;
   for(int i=0;i<=100;i++){
     int total=0;
     for(int j=0;j<n;j++){
       total+=(pos[j]-i)*(pos[j]-i);
     }
     if(total<min)min=total;
   }
   System.out.println(""+min);
 }
}