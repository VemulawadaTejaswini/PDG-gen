import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
      
      	char[] letter = new char [data.length()];
      
      	for (int i = 0; i < data.length(); i++ ) {
          letter[i] = data.charAt(i);
        }
    
    if (letter[2] == letter[3] && letter[4] == letter[5] ) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
      
    }
}
