import java.util.Scanner;

public class Main {
 public static <I> void main(String[] args){
  Scanner input=new Scanner(System.in);
  int n ;
  int[] I;
  I=new int[1000];
  double sum,m,k,a;
  
  while((n = input.nextInt())!=0){
   sum=0.0;
   for (int i=0;i<n;i++){
    I[i]=input.nextInt();
   }
   for (int i=0;i<n;i++){
    sum=sum+I[i];
 
   }
  
   m=(double)sum/n;
   k=0.0;
   double u=0.0;
   
   for (int i=0;i<n;i++){
    k=(I[i]-m)*(I[i]-m);
    u=u+k;
   }
   
   a=u/n;
   System.out.println(Math.sqrt(a));
  
  }
 }
}