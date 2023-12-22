import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		String str = sc.next();
        if (num < str.length()){
          str = str.substring(0, num);
          System.out.printf(str + "...");
        }
		else
        {
          System.out.printf(str);
        }
    }
}