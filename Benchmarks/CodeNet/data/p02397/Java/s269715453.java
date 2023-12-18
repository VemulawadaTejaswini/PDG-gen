import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int x, y;

    while (true){
      String line = br.readLine();
      String[] data = line.split(" ");
      x = Integer.parseInt(data[0]);
      y = Integer.parseInt(data[1]);
      if (x == 0 && y == 0) {break;}
      sb.append(data[1] + " ").append(data[0]).append("\n");
    }
    System.out.println(sb);
  }
}