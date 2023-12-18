import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			int h = i / 3600;
			int m = i % 3600 / 60;
			int r = i % 60;
			 System.out.println(h + ":" + m + ":" + r);
		}  
}

