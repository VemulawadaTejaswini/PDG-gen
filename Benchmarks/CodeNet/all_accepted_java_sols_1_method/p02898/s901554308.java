import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int cnt = 0;
    for(int i=0; i<N; i++){
      if(sc.nextInt()>=K){
        cnt++;
      }
    }
    System.out.print(cnt);
  }
}