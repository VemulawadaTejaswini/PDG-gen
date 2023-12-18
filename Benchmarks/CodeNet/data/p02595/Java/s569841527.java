import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int D = scan.nextInt();

      int ans = 0;
      for(int i = 0;i < N;i++){
        int x = scan.nextInt();
        int y = scan.nextInt();
        if((x * x + y * y) <= D * D){
            System.out.println(x + "," + y);
            ans++;
        }
      }
        System.out.println(ans);
    }
}