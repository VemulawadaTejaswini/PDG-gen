import java.util.Scanner;
  
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
      String input = sc.next();
      int output = 0;
      if(input.equals("0")){
        break;
      }
      for(int i = 0; i < input.length(); i++){
        char c = input.charAt(i);
        output += Character.getNumericValue(c);
      }
      System.out.println(output);
    }
  }
}
