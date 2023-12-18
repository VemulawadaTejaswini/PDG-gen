import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int i = 1;

    while(true){
      int line = Integer.parseInt(br.readLine());
      if (line == 0){
        break;
      }
      sb.append("Case ").append(i).append(": ").append(line).append("\n");
      i++;
    }
      System.out.print(sb);
  }