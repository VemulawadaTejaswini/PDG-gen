import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNextInt()){
      int pasta = Integer.MAX_VALUE;
      int juice = Integer.MAX_VALUE;

      for(int i = 0; i < 3; i++){
        pasta = Math.min(pasta, sc.nextInt());
      }
      for(int i = 0; i < 2; i++){
        juice = Math.min(juice, sc.nextInt());
      }

      System.out.println(pasta + juice - 50);
    }
  }
}