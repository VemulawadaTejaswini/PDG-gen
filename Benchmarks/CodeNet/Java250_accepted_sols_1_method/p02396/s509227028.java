import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> n = new ArrayList<Integer>();

    while(scanner.hasNextInt()){
      int x = scanner.nextInt();
      if(x == 0){
        break;
      }
      n.add(x);
    }
    for (int i = 0; i < n.size(); i++){
      System.out.println("Case " + (i + 1) + ": " + n.get(i));
    }
  }
}