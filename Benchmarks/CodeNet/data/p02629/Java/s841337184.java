import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = Long.parseLong(scanner.nextLine());

    String name = "";

   name = calc(N, name);

   System.out.println(name);
    scanner.close();
    return;
  }

  public static String calc(long N, String name){
    char c = (char) (N % 26 + 'a' - 1);
    if( N%26 == 0){
      c = 'z';
      N -= 26;
    }
    name = String.valueOf(c) + name;
    N = N - N%26;
    if(N / 26 > 0){
      name = calc(N / 26, name);
    }
    return name;
  }
}
