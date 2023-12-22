import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n =kbd.nextInt();
  double m =kbd.nextInt();
   int[] A= new int[n];
   for(int i=0;i<n;i++){
     A[i]=kbd.nextInt();
}
double s=0;
   for(int i=0;i<n;i++){
     s=s+A[i];
   }
   int c =0;
   double p=s/(4*m);
   for(int i=0;i<n;i++){
     if(A[i]>=p){
   c=c+1;
 }
}
 if(c>=m){
 System.out.println("Yes");
}else{
  System.out.println("No");
}
}
}