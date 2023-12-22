import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    for(int i=1; i<=N; i++){
      int tmp = sc.nextInt();
      if(i != tmp){
        cnt++;
      }
    }
    if(cnt == 0 || cnt == 2){
      System.out.print("YES");
    }else{
      System.out.print("NO");
    }
  }
}

        
