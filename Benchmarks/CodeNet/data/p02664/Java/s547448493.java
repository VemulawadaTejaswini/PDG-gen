import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
     
public class Main{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder('\n' + scanner.next() + '\n');
    
    if(sb.charAt(sb.length() - 2) == '?'){
        sb.setCharAt(sb.length() - 2, 'D');
    }
    
    boolean flag = true;
    List<Integer> indices = new ArrayList<>();
    
    for(int i = 1; i < sb.length(); i++){
        indices.add(i);
    }
    
    while(indices.size() > 0){
      List<Integer> tmp = new ArrayList<>();
        
      for(int i = 0; i < indices.size(); i++){
        int index = indices.get(i);
        
        if(sb.charAt(index) == '?'){
          if(sb.charAt(index - 1) == 'P'){
            sb.setCharAt(index, 'D');
          }else if(sb.charAt(index + 1) == 'D'){
            sb.setCharAt(i, 'P');
          }else if(sb.charAt(index + 1) == 'P'){
            sb.setCharAt(i, 'D');
          }else if(sb.charAt(index + 1) == '?'){
            tmp.add(index);
          }
        }
      }
        
      indices = tmp;
    }
        
    System.out.println(sb.substring(1, sb.length() - 1));
  }
}