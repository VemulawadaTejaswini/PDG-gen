import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] T = new int[N];
    for(int i=0; i<N; i++){
      T[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i=0; i<N-1; i++){
      for(int j=i+1; j<N; j++){
        sum += T[i]*T[j];
      }
    }
    System.out.print(sum);
  }
}