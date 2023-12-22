import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int cnt5 = 0;
      	int cnt7 = 0;
      	int a = sc.nextInt();
      	cnt5 = (a == 5) ? cnt5 + 1:cnt5;
      	cnt7 = (a == 7) ? cnt7 + 1:cnt7;
      	int b = sc.nextInt();
      	cnt5 = (b == 5) ? cnt5 + 1:cnt5;
      	cnt7 = (b == 7) ? cnt7 + 1:cnt7;
      	int c = sc.nextInt();
      	cnt5 = (c == 5) ? cnt5 + 1:cnt5;
      	cnt7 = (c == 7) ? cnt7 + 1:cnt7;
      
      	if (cnt5 == 2 && cnt7 == 1) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
    }
}
