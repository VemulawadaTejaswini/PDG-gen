import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
      	int a = Integer.parseInt(sc.next());
      
      	int result = (x < a) ? 0: 10;
      	System.out.print(result);
    }
}
