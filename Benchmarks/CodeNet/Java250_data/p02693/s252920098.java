import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int flag = 0;
    for(int i = A; i<=B; i++){
            if(i%K == 0){
              flag++;
              break;
            }
    }
    if(flag==0){
      System.out.println("NG");
    }else if(flag==1){
      System.out.println("OK");
    }
  }
}