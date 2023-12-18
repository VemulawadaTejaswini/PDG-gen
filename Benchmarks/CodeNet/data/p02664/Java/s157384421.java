import java.util.Scanner;

public class Main{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder('\n' + scanner.next() + '\n');
    
    for(int i = 1; i < sb.length() - 1; i++){
      if(sb.getCharAt(i) == '?'){
        if(sb.getCharAt(i + 1) == 'D'){
          sb.append('P'):
        }else{
          sb.append('D');
        }
      }
    }
    
    System.out.pritnln(sb);
  }
}