import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    String output = "";
    for(int i = x - n + 1; i <= x + n -1; i++){
      output += "" + i + " ";
    }
    System.out.println(output);
  }
}