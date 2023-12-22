import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String column[] = line.split(" ");
    int card1 = Integer.parseInt(column[0]);
    int card0 = Integer.parseInt(column[1]);
    int draw = Integer.parseInt(column[3]);
    
    if(card1 >= draw){
      System.out.println(draw);
    }else if(card1 + card0 >= draw){
      System.out.println(card1);
    }else{
      System.out.println(card1 - (draw - card1 -card0));
    }
  }
}
