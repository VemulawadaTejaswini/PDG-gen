import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
      
        for(int i=0; a * i <= b && i <= c; i++) { 
            count = i;
		}
        System.out.print(count);
	}
}