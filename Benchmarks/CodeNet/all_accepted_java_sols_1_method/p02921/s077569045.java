import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    String T = sc.next();

    int count = 0;

    for(int i = 0; i < 3; i++){
      if(S.substring(i,i + 1).contains(T.substring(i,i + 1))){
       count = count + 1;
      }
    }
    System.out.println(count);
  }
}