import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(solve(sc.next()));
  }
  static int solve(String s){
    if(s.contains("RRR")){
      return 3;
    } else if(s.contains("RR")){
      return 2;
    } else if(s.contains("R")){
      return 1;
    } else {
      return 0;
    }
  }
}
