import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String W = br.readLine().toLowerCase();
    int count = 0;

    while (true){
      String line = br.readLine();
      if (line.equals("END_OF_TEXT")) {break;}
      line = line.toLowerCase();
      String[] words = line.split(" ");
      for (int i = 0; i < words.length; i++){
        if (W.equals(words[i])) {count++;}
      }
    }
    System.out.println(count);
  }
}