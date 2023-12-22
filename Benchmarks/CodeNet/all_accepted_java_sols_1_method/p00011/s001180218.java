import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int w = scanner.nextInt();
    int n = scanner.nextInt();
    int[] values = new int[w];
    for(int i = 0; i <values.length; i++){
      values[i] = i + 1;
    }
    for(int i = 0; i < n; i++){
      String str = scanner.next();
      String[] ab = str.split(",");
      int a = Integer.parseInt(ab[0]) - 1;
      int b = Integer.parseInt(ab[1]) - 1;
      int temp = values[a];
      values[a] = values[b];
      values[b] = temp;
    }
    for(int i = 0; i < values.length; i ++){
      System.out.println(values[i]);
    }
  }
}