import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    int max = Integer.parseInt(line.split(" ")[0]);
    int target =Integer.parseInt(line.split(" ")[1]);
    line = scan.nextLine();
    char ch = line.charAt(target-1);
    ch = (char) (ch + 0x20);
    System.out.print(line.substring(0, target-1)+ ch + line.substring(target,max) );

  }

}