import java.util.Scanner;

public class Main{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);
    
    String text = scanner.next();
    
    List<String> list = new ArrayList<>();
    replace(list, new StringBuilder(text), "", 0);
    
    int maxScoore = 0;
    int maxIndex = 0;
    int index = 0;
    
    for(String str : list){
      int score = 0;
      
      for(int i = 0; i < str.length; i++){
        if(str.charAt(i) == '?'){
          continue;
        }
        
        if(str.charAt(i) == 'D'){
          score++;
        }else{
          if(str.charAt(i + 1) == 'D'){
            score++;
          }
        }
      }
      
      if(score > maxScore){
        maxScore = score;
        maxIndex = index; 
      }
      
      index++;
    }
    
    return list.get(maxIndex)
  }
  
  private void replace(List<String> list, String text, String tmp, int index){
    for(int i = index; i < text.length){
      tmp += text.charAt(i);
      
      if(text.charAt(i) == '?'){
        replace(list, new StringBuilder(text), tmp + 'P', i + 1);
        replace(list, new StringBuilder(text), tmp + 'D', i + 1);
      }
    }
    
    list.add(tmp + '\n');
  }
}