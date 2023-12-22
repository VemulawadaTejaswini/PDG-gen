import java.util.Scanner;

public class Main{
	public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      String input_text = scanner.nextLine();
      scanner.close();
      
      String[] str = input_text.split(" ", 0);
      
      for(int i=0; i<str.length; i++){
		if (Integer.parseInt(str[i])==0){
        	
          System.out.print(i+1);
          break;
        
        }
      }
    }

}