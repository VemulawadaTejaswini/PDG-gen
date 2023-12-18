import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    int count = 0;
    for(int i = 0; i < str.length(); i++) {
      count += str.charAt(i) == '+' ? 1 : -1;
    }
    
    System.out.println(count);
  }
}
