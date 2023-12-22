    import java.util.*;
     
    class Main {
       public static void main(String[] args)
       {
          Scanner scan = new Scanner(System.in);
     
          int Y500 = scan.nextInt();
          int Y100 = scan.nextInt();
          int Y50  = scan.nextInt();
     
          int N = scan.nextInt();
          int count = 0;
          int S, U, V;
     
     
          for(int i = Y500; i >= 0; i--){
              S = N;
              S = N - (500 * i);
              if(S == 0){
                 count++;
                 }
              if(S != 0){
                 for(int j = Y100; j >= 0; j--){
                     U = S;
                     U = S - j * 100;
                     if(U == 0){
                        count++;
                        }
                     if(U != 0){
                        for(int k = Y50; k >= 0; k--){
                            V = U;
                            V = V - (50 * k);
                            if(V == 0){
                               count++;
                               }
                            }
                        }
                     }
                 }
              }
          System.out.println(count);
       }
    }