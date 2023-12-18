import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    String[] arr = s.split(" ", 0);

    for (int i = 0 ; i < arr.length ; i++){
      System.out.print(arr[i].substring(0,1));
    }

  }
}