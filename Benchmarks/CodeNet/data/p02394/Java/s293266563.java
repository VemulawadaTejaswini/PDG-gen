import java.io.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str_Fifth_Number = br.readLine().split(" ");
    int[] five_Numbers = new int[5];
    
    for(int i = 0 ; i < five_Numbers.length; i++){
      five_Numbers[i] = Integer.parseInt(str_Fifth_Number[i]);
    }
    boolean x_Check = size_Check(five_Numbers[0], five_Numbers[2], five_Numbers[4]);
    boolean y_Check = size_Check(five_Numbers[1], five_Numbers[3], five_Numbers[4]);
    if(x_Check && y_Check){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }

  private static boolean size_Check(int range, int circle_position, int radius){
    if(range < circle_position + radius) return false;
    if(0 > circle_position - radius) return false;
    return true;
  }

}

