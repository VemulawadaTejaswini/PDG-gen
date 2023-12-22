import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    String[] string_array = scanner.next().split("");

    System.out.println(Integer.parseInt(string_array[0])+Integer.parseInt(string_array[1])+Integer.parseInt(string_array[2]));
  }
}