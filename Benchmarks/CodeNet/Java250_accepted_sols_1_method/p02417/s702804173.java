import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] chars = new int[256];
    while(scanner.hasNextLine()){
      String line = scanner.nextLine();
      for(int i = 0; i < line.length(); i++){
        char c = line.toLowerCase().charAt(i);
        for(char j = 'a'; j <= 'z'; j++){
          if(c == j) chars[j] += 1;
        }
      }
    }
    for(char ch = 'a'; ch <= 'z'; ch++){
      System.out.println(ch + " : " + chars[ch]);
    }
  }
}