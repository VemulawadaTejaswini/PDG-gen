import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int day = 25 - sc.nextInt();
    String output = "Christmas";
    for(int i = 0; i < day; i++){
      output += " Eve";
    }
    System.out.println(output);
  }
}