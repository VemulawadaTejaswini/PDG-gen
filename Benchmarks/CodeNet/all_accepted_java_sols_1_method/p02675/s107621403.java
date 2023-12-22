import java.util.Scanner;

public class Main{

public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String parm = scanner.next();
  
  int i = Integer.parseInt(parm)%10;
  
  if (i == 3) {
    System.out.print("bon");
  } else if(i == 0 || i == 1 || i == 6 || i == 8) {
    System.out.print("pon");
  } else {
    System.out.print("hon");
  }
}
}

  