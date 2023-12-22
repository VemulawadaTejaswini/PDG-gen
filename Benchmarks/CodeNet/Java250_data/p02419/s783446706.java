import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String W = sc.next().toLowerCase();
    String T;
    int count=0;

    while(!(T = sc.next()).equals("END_OF_TEXT")){
      if(T.toLowerCase().equals(W)){
        count++;
      }
    }
    sc.close();
    System.out.println(count);
  }
}
