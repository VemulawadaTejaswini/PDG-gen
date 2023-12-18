import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int i = N - N/2;
   float n = 0f;
   n = (float) i/N;
       
   System.out.println(n);
 
   
 }
}