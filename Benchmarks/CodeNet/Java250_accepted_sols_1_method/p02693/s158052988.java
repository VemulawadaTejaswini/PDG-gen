import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int K = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      String ans = "NG";
      int ak = A / K;
      for(int i = ak; i * K <= B; i++){
        int ik = i * K;
        if(A <= ik && ik <= B){
          ans = "OK";
          break;
        }
      }
      System.out.println(ans);
    } 
}