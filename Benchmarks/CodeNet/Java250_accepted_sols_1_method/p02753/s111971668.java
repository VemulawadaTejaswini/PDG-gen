import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	String s = input.nextLine();
      	int c = 0;
        for (int i = 0; i < s.length(); i++)
        	if (s.charAt(i) == 'A')
              c++;
      	if (c == 0 || c == 3)
          System.out.println("No");
      	else
          System.out.println("Yes");
    }
}