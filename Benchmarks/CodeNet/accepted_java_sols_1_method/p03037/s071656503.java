import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int M = sc.nextInt();
   
   int min = 1;
   int max = N;
   
   for(int i=1;i<=M;i++)
   {
    int L = sc.nextInt();
    int R = sc.nextInt();
     
     if(min<L) min = L;
     if(max>R) max = R;
     
   }
   
  if(max>=min) System.out.println(max-min+1);   
  else System.out.println(0);   
 }
}