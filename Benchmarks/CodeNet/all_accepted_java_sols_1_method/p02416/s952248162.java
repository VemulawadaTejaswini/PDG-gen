import java.util.Scanner;
  
class Main{
  public static void main(String[] arg){
    String input;
 
    Scanner in = new Scanner(System.in);

    while(true){
        input = in.nextLine();

        if(input.equals("0")) break;

        int tmp=0;
        for(int i=0; i<input.length(); ++i){
            
            char ch = input.charAt(i);
            tmp += Character.getNumericValue(ch);

        }
        System.out.println(tmp);
    }

  }
}