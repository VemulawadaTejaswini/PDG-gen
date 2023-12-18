import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] in = sc.next().toCharArray();
    if(in[2] == in[3] && in [4] == in[5]){
      System.out.println("Yes");

    }else{
      System.out.println("No");
    }
  }
}