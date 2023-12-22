import java.util.Scanner;

public class Main{
  static int K[];
  static int Like[];
  static int check[];
  static int A;
  static int count=0;
  public static void main(String args[]){
    check = new int[33];
    for(int i=0;i<33;i++){
      check[i]=0;
    }
    Scanner sc = new Scanner(System.in);
    int N;
    int M;
    N = sc.nextInt();
    M = sc.nextInt();
    K = new int[N];
  for(int i=0;i<N;i++){
    K[i]=sc.nextInt();
    for(int j=0;j<K[i];j++){
      A = sc.nextInt();
      check[A] += 1;
    }
  }
  for(int i=0;i<33;i++){
    if(check[i]==N){
      count += 1;
    }
  }
  System.out.println(count);
  }
}
