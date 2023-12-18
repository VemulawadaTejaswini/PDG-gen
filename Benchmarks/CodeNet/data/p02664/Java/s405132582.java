import java.util.Scanner;

public class Main{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder("\nPD?D??P\n");
        
    for(int i = 1; i < sb.length() - 1; i++){
      if(sb.charAt(i) == '?'){
        if(sb.charAt(i + 1) == 'D'){
          sb.setCharAt(i, 'P');
        }else if(sb.charAt(i + 1) == '?'){
          sb.setCharAt(i, 'P');
          sb.setCharAt(i + 1, 'D');
        }else{
          sb.setCharAt(i, 'D');
        }
      }
    }
        
    System.out.println(sb.substring(1, sb.length() - 1));
  }
}