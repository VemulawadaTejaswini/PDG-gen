import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = null;
    
    line = scanner.nextLine();
    long oniPlace = Integer.parseInt(line.split(" ")[0]);
    long oniWalk = Integer.parseInt(line.split(" ")[1]);

    line = scanner.nextLine();
    long playerPlace = Integer.parseInt(line.split(" ")[0]);
    long playerWalk = Integer.parseInt(line.split(" ")[1]);
    
    long sec = Integer.parseInt(scanner.nextLine());


    long oniMove = (sec * oniWalk);
    long playerMove = (sec * playerWalk);

    
    if (oniPlace < playerPlace) {
	  oniPlace += oniMove;
      playerPlace += playerMove;
      if (oniPlace >= playerPlace) {
      	System.out.println("YES");
      } else {
      	System.out.println("NO");
      }
    } else {
	  oniPlace -= oniMove;
      playerPlace -= playerMove;
      if (oniPlace <= playerPlace) {
      	System.out.println("YES");
      } else {
      	System.out.println("NO");
      }
    }
    
    
  }
}
