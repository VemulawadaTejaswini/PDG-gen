import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int[] a = new int[10000];
       for(int i=0;i<10000;i++){
           a[i] = sc.nextInt();
           if(a[i]==0){
               break;
           }else{
               System.out.println("Case "+(i+1)+": "+a[i]);
           }
       }
       sc.close();
   } 
}
