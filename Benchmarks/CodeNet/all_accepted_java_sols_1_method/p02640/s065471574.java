import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
      int X = scan.nextInt();
      int Y = scan.nextInt();
      Boolean ans = false;
      
      for(int i=0; i<=X; i++){
        if(Y == (2*i) + (4*(X-i)))
          ans = true;
      }
      if(ans == true)
        System.out.println("Yes");
      else
        System.out.println("No");
   }
}