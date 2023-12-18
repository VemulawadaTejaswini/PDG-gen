import java.util.*;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
   int N = sc.nextInt();
   int X = sc.nextInt();
   int[] L = new int[N];
   
   for(int i =0; i<N;i++){
       L[i] = sc.nextInt();
   }
   
   int ans = 1;
   int D = 0;
   for(int n = 0; n < L.length; n++){
       D = D + L[n];
       if(D <= X){
           ans++;
       }
   }
   
   System.out.println(ans);
    }  
}