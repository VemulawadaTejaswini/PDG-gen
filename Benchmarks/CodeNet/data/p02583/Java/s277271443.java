import java.util.Arrays;
import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int cou=0;
   int n=kbd.nextInt();
      int[] L= new int[n];
   for(int i=0;i<n;i++){
     L[i]=kbd.nextInt();
   }
   Arrays.sort(L);

  for(int i=0;i<n-2;i++){
    for(int j=i+1;j<n-1;j++){
      for(int k=j+1;k<n;k++){
       if(L[k]!=L[j]&&L[k]!=L[k]&&L[j]!=L[i]){
         if(L[k]+L[j]<L[i]){
         cou++;
       }
     }
      }
    }
}
System.out.println(cou);}
}
