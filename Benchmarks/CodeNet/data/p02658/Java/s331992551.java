import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int N = sc.nextInt();
      long ans = 1;
      long max = (long)Math.pow(10,18);
      for(int i = 0 ; i < N; i++) ans *= sc.nextLong();
      if(ans > max || ans < 0l){
        System.out.println("-1");
      } else {
        System.out.println(ans);
      }
    } 
}