import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long N = Long.parseLong(scanner.next());
    scanner.close();

    int ans = 0;
    for(int i=2; i<=Math.pow(N, 0.5); i++){
      for(int j=2; j<=i; j++){
        if(i%j==0 && i==j){
          int n = 1;
          int add = 2;
          while(true){
            if(N%(Math.pow(i, n))==0){
              ans++;
              n += add;
              add++;
            }else{
              break;
            }
          }
        }else if(i%j==0 && i!=j){
          break;
        }
      }
    }
    System.out.println(ans);
  }
}
