import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    List<String> list = new ArrayList<>();
    
    for(int i=0; i<s.length(); i++){
      if(list.size() == 0 && s.charAt(i) =='B'){
        continue;
      }
      
      if(s.charAt(i) == '0'){
        list.add("0");
      }
      if(s.charAt(i) == '1'){
        list.add("1");
      }
      if(s.charAt(i) == 'B'){
        list.remove(list.size()-1);
      }
    }
    for(int i=0; i<list.size(); i++){
      System.out.print(list.get(i));
    }
  }
}
    
