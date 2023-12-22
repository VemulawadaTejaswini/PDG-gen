import java.util.Scanner;
import java.util.ArrayList;
class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
 
int N = scan.nextInt();
int K = scan.nextInt();
int TT[] = new int[N];
int i, j, e, d;
int count = 0;
  for (i = 0; i < K; i++){
    d = scan.nextInt();
      for(j = 0; j < d; j++){
        e = scan.nextInt();
        TT[e-1] = 1;
        }
   }

  for (i = 0; i < N; i++){
    if (TT[i] == 0){
    count += 1;
    }
    else{
    }
  }
  System.out.println(count);
 }
}