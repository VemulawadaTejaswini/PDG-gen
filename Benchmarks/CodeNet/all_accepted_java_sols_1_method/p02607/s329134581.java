import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int[] A= new int[n];
   int[] B= new int[n];
   int a=0;
   if(n%2==0){
   for(int i=0;i<n/2;i++){
     A[i]=kbd.nextInt();
     B[i]=kbd.nextInt();
     if(A[i]%2!=0){
       a++;
   }
 }
}else{
  for(int i=0;i<n/2;i++){
    A[i]=kbd.nextInt();
     B[i]=kbd.nextInt();
    if(A[i]%2!=0){
      a++;
  }
}
     int x=kbd.nextInt();
if(x%2!=0){
  a++;
}
}
 System.out.println(a);
}
}