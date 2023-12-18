import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      long N = scan.nextLong();
      long D = scan.nextLong();

      int ans = 0;
      for(int i = 0;i < N;i++){
        long x = scan.nextLong();
        long y = scan.nextLong();
        if((x * x + y * y) <= D * D){
            ans++;
        }
      }
        System.out.println(ans);
    }
}