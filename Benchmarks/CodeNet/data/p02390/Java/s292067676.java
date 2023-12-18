import java.io.*;

class Watch{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int time = Integer.parseInt(input);
    int h = time / 3600;
    int m = (time % 3600) / 60;
    int s = (time % 3600) % 60;
    System.out.println(h + ":" + m + ":" + s + ":");
  }
}