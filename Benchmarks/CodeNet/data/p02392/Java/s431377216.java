import java.io.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] three_number = br.readLine().split(" ");
    int a = Integer.parseInt(three_number[0]);
    int b = Integer.parseInt(three_number[1]);
    int c = Integer.parseInt(three_number[2]);
    if(a<b && b<c){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

