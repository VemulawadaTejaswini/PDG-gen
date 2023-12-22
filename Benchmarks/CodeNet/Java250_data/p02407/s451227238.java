import java.io.*;

class Main {
  public static void main(String[] args)throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int n = Integer.parseInt(br.readLine());
      String[] data = br.readLine().split(" ");

      for(int i = 0; i < n-1;){
          sb.append(data[n-++i]).append(" ");
      }
      sb.append(data[0]);

      System.out.println(sb.toString());

  }
}