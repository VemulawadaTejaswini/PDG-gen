import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int a = Integer.parseInt(line[0]);
    int b = Integer.parseInt(line[1]);
    String op = "==";
    if (a>b) {
      op = ">";
    }else if(a<b){
      op = "<";
    }
    System.out.println("a "+op+" b");
  }
}