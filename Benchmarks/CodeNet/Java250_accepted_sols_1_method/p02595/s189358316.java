import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      long N = scan.nextInt();
      long D = scan.nextInt();

      int ans = 0;
      for(int i = 0;i < N;i++){
        long x = scan.nextInt();
        long y = scan.nextInt();
        if((x * x + y * y) <= D * D){
            ans++;
        }
      }
        System.out.println(ans);
    }
}