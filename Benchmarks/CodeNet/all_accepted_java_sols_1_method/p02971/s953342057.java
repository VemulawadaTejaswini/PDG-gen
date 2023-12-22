import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] An = new int[N];
   for(int i =0;i<N;i++){
   An[i] = sc.nextInt();
   }
   int max = 0;
   int max2 = 0;
   if(An[0]<=An[1]){
   max = An[1];
   max2 = An[0];
   }else{
   max = An[0];
   max2 = An[1];
   }
     
   
   for(int i =2;i<N;i++){
    if(max<=An[i]){
      max2 = max;
      max = An[i];
    }else if(max2<=An[i]) max2 = An[i];
   }
   for(int i = 0;i <N; i++){
     if(An[i]==max) System.out.println(max2);
     else System.out.println(max);
   }

 }
}