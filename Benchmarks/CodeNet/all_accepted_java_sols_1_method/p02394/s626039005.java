import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        	int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            if((e <= c && c <= a - e) && (e <= d && d <= b - e)) { 
            	System.out.println("Yes");
            }else {
            	System.out.println("No");
            }
        }
    }
}

