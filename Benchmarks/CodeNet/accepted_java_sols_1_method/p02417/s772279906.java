import java.io.*;

public class Main {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      int[] alphabet = new int[26];
      String str;
      while((str = reader.readLine()) != null) {
        str = str.toLowerCase();
        byte[] asciiStr = str.getBytes("US-ASCII");
        for (int i = 0; i < asciiStr.length; i++) {
          if (asciiStr[i] >= 97 && asciiStr[i] <= 122) {
            alphabet[asciiStr[i] - 97]++;
          }
        }
      }
      for (int i = 0; i < 26; i++) {
        System.out.printf("%c : %d\n", i + 97, alphabet[i]);
      }
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}