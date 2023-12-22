import java.util.Scanner;
  
class Main{
  public static void main(String[] arg){
    String input;
    StringBuffer output = new StringBuffer();
 
    Scanner in = new Scanner(System.in);

    input = in.nextLine();

    for(int i=0; i<input.length(); i++){
        char ch = input.charAt(i);
        if(Character.isLowerCase(ch))
            output.append(Character.toUpperCase(ch));
        else if(Character.isUpperCase(ch))
            output.append(Character.toLowerCase(ch));
        else
            output.append(ch);
    }

    System.out.println(output.toString());
 
  }
}