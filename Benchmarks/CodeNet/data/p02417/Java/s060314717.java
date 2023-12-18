import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) {
    StringBuilder output = new StringBuilder();
    String crlf = System.getProperty("line.separator");
    int[] counter = new int[26];
    
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String input = reader.readLine();
      
      for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i); 
        if (((int)ch >= 65 && (int)ch <= 90) || ((int)ch >= 97 && (int)ch <= 122) ) {
          int num = ch % 32 - 1;
          counter[num]++;
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    
    for (int i = 0; i < counter.length; i++) {
      output.append((char)(i + 97)).append(" : ").append(counter[i]);
      if (i != counter.length - 1) output.append(crlf);
    }
    System.out.println(output.toString());
  }
}