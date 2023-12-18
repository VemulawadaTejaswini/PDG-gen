import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int sum = 0;
    int ans = 1;
    for(int i = 0; i < N;i++){
        sum += sc.nextInt();
        if(sum <= X) {
            ans++;
        } else {
            break;
        }
    }
    System.out.println(ans);
  }
}
