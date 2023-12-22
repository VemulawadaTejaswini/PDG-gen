import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    scanner.close();

    StringBuilder builder = new StringBuilder();
    int input_length = input.length();
    for(int i=0; i<input_length; i++){
      if(input.charAt(i)=='P' || input.charAt(i)=='D'){
        builder.append(input.charAt(i));
      }
      if(input.charAt(i) == '?'){
        builder.append('D');
      }
    }
    System.out.println(builder.toString());
  }
}
