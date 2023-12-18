import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args) throws Exception{
    int x,y,tmp;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true){
      String[] line = br.readLine().split(" ");
      x = Integer.parseInt(line[0]);
      y = Integer.parseInt(line[1]);
      if(x==0 && x==y){
        break;
      }else if(x>y){
        tmp = x;
        x = y;
        y = tmp;
      }
      System.out.println(x+" "+y);
    }
  }
}