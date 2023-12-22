import java.util.Scanner;

class Main{
  public static void main(String[] args){
    String[] data;
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      data = sc.nextLine().split(" ");
      int digit = Integer.parseInt(data[0]) + Integer.parseInt(data[1]);
      System.out.println("" + Integer.toString(digit).length());
    }
  }
}