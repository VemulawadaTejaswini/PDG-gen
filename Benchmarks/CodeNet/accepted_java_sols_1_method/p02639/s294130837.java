import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int[] A= new int[5];
   for(int i=0;i<5;i++){
     A[i]=kbd.nextInt();
     if(A[i]==0){
       System.out.println(i+1);
     }
 }
}
}
