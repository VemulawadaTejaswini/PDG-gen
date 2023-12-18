import java.io.*;

class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    while(true){
      String data[] = br.readLine().split(" ");
      int a = Integer.parseInt(data[0]);
      int b = Integer.parseInt(data[1]);
      if(a == 0 && b == 0)
    	  break;

      for(int i = 0; i < a; i++){
          for(int j = 0; j < b; j++){
              if((i + j) % 2 == 0)
                sb.append("#");
              else
                sb.append(".");
          }
          sb.append("\n");
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }
}