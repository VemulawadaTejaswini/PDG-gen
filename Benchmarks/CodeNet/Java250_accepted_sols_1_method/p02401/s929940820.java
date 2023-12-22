import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(true){
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int a = Integer.parseInt(str2[0]);
    int b = Integer.parseInt(str2[2]);
    String op = str2[1];
    String plus = "+";
    String minus = "-";
    String product = "*";
    String division = "/";

      if(op.equals(plus))
        System.out.println(a + b);
      else if(op.equals(minus))
        System.out.println(a - b);
      if(op.equals(product))
        System.out.println(a * b);
      else if(op.equals(division))
        System.out.println(a / b);
      else if(op.equals("?")){
        break;
      }
    }
  }
}