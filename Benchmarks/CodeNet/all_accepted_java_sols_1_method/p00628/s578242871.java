import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      String s = sc.nextLine();
      if(s.equals("END OF INPUT"))break;
      String[] t = s.split(" ");
      for(int i=0;i<t.length;i++){
        System.out.print(t[i].length());
      }
      System.out.println();
    }
  }
}