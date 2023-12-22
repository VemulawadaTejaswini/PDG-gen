import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    String s = "Christmas";
    for(int i =0;i<25-D;i++){s += " Eve";}
    System.out.println(s);
  }
}