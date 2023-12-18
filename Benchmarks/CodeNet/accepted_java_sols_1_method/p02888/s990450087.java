import java.util.Scanner;
import java.util.Arrays;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int L[] = new int[N];
 
    for(int i = 0; i < N; i++){
      L[i] = Integer.parseInt(sc.next());
    }
 
    Arrays.sort(L);
    int count = 0;
    for(int i = 0; i < N - 2; i++){
      for(int j = i + 1; j < N - 1; j++){
        for(int k = j + 1; k < N; k++){
            if(L[k] < L[i] + L[j]){
              count++;
            }
        }
      }
    }
 
    System.out.println(count);
  }
}