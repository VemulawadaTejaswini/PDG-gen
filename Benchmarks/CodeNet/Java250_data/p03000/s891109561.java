import java.util.Scanner;

class Main{
  public static int temp = 0;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int L[] = new int[N];
    for(int i = 0; i < N;i++){
     L[i] = sc.nextInt();
    }
    N = N + 1;
    
    int ans = 0;
    if(0 <= X){
      ans = ans + 1;
     }
    for(int i = 2; i <= N;i++){
     temp = method(i,L[i-2]);
     if(temp <= X){
      ans = ans + 1;
     }
    }
    System.out.println(ans);

  }
  static int method(int Ni,int Li){
    return (temp + Li);
  }
}