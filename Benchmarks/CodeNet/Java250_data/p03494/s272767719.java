import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M[] = new int[N];
      int count =0;
      int flag =0;
      for(int n = 0; n<N; n++){
          M[n] = sc.nextInt();
      }
     while (true){
         for(int n = 0; n<N; n++){
             int remainder= M[n] % 2;
             if(remainder == 1){
                 flag =1;
             }
             M[n]= M[n] / 2;
         }
         if(flag==1){
             break;
         }
         count++;
     }
     System.out.println(count);
         }
}