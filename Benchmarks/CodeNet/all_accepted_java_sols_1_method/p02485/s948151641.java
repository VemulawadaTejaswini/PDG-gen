import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 
        Scanner scan = new Scanner(System.in);
 
        while (true) {
            String str = scan.nextLine();
            if (str.equals("0")) break;
            int sum = 0;
            char[] box = str.toCharArray();
            for (int i = 0; i < box.length; i++)
                sum += box[i] - '0';
            System.out.println(sum);
        }
 
    }
}