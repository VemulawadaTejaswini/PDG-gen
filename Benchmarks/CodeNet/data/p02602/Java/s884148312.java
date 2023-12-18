import java.util.*;

public class Main{
 public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int k = sc.nextInt();
   int[] a = new int[n];
   
   for(int i = 0;i < n;n++){
    a[i] = sc.nextInt();
   }
   
   for(int j = k;j < n;j++){
    if(a[j] > a[j-k]){
     System.out.println("Yes");
    }else{
     System.out.println("No");
    }
   }
  
 }
}