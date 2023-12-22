import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  String str = scan.nextLine();
  String[] strs = str.split(" ");
  int D = Integer.parseInt(strs[1]);
  int count = 0;
    while (scan.hasNext()){
      str = scan.nextLine();
      strs = str.split(" ");
      int x = Integer.parseInt(strs[0]);
      int y = Integer.parseInt(strs[1]);
      double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
      if(distance<=D) count++;
    }

    System.out.println(count);
}
}
