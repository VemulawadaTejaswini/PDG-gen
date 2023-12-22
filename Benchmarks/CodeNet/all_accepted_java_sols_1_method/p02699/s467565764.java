import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
      	int b = scan.nextInt();
      
      	if (b >= a) {
          System.out.println("unsafe");
        } else {
          System.out.println("safe");
        }
 
        scan.close();
    }
}