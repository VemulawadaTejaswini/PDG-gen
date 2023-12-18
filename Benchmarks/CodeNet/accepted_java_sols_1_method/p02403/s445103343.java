import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 & b == 0)
                break;
            if(a >= 1 && a <= 300){
		if(b >= 1 && b <= 300){
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
            }
          }
        }
    }
}
