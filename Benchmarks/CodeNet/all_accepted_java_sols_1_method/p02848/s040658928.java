import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> words;
    words=new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K"
                                        ,"L","M","N","O","P","Q","R","S","T","U","V"
                                        ,"W","X","Y","Z"));
    int num = Integer.parseInt(sc.next());
    String line = sc.next();
    for(int i = 0; i < line.length(); i++){
      String word = line.substring(i,i+1);
      if(words.indexOf(word)+num > 25){
        System.out.print(words.get(words.indexOf(word)+num-26));
      }else{
        System.out.print(words.get(words.indexOf(word)+num));
      }
    }
    System.out.println();
  }
}