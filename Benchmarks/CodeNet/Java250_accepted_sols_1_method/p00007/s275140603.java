import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int gankin = 100000, week = sc.nextInt();
    double risoku = 0.05;
    for(int i = 0;i < week;i++){
      gankin *= (1 + risoku);
      if(gankin % 1000 != 0){
        gankin = gankin - (gankin % 1000) + 1000;
      }
    }
    System.out.println(gankin);
  }
}