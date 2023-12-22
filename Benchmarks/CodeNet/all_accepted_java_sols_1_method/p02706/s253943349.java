import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
  int n=kbd.nextInt();
  int m=kbd.nextInt();
   int[] A= new int[m];
   for(int i=0;i<m;i++){
     A[i]=kbd.nextInt();
}
long a=0;
   for(int i=0;i<m;i++){
     a=a+A[i];
   }
   if(a<=n){
     System.out.println(n-a);
   }else{
     System.out.println(-1);
   }
}
}
