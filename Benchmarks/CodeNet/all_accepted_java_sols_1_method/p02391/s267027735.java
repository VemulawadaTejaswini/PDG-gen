import java.io.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] two_number = br.readLine().split(" ");
    int a = Integer.parseInt(two_number[0]);
    int b = Integer.parseInt(two_number[1]);
    if(a<b){
      System.out.println("a < b");
    }else if(a>b){
      System.out.println("a > b");
    }else{
      System.out.println("a == b");
    }
  }
}

