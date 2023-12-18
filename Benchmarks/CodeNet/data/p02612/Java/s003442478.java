import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = (a + 1000) / 1000;
    int ans = b * 1000 - a;
      
    System.out.println(ans);  
      
    }

}