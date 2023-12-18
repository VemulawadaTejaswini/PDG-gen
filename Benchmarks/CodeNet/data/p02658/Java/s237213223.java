import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int ans = 1;
    for(int i=0;i<n;i++){
      ans *= scan.nextInt();
    }
    System.out.println(ans);
  }
}