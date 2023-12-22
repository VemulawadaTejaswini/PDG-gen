import java.io.*;
 
class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    while(true){
      String datas = br.readLine();
      String[] data = datas.split(" ");
      int a = Integer.parseInt(data[0]);
      int b = Integer.parseInt(data[1]);
      if(a == 0 && b == 0)
    	  break;
      
      if(a > b){
    	  int tmp = a;
    	  a = b;
    	  b = tmp;
      }
      
      sb.append(a).append(" ").append(b).append("\n");
    }
    System.out.print(sb);
  }
}