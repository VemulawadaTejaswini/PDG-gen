import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int S = sc.nextInt();
      	int W = sc.nextInt();
        boolean isSafe = S > W;
      String ans = "unsafe";  
      if (isSafe) ans = "safe";
      	System.out.println(ans);
    } 
}