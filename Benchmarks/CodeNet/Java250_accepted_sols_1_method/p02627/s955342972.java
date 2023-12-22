import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String a = scanner.nextLine();
      
      for(int m=0;m<a.length();m++) {
        char aa = a.charAt(m);
        if(Character.isLowerCase(aa) == true) {
          System.out.println("a");
        }else{
          System.out.println("A");
        }
      }
    }
}