import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> n = new ArrayList<Integer>();
    ArrayList<Integer> m = new ArrayList<Integer>();
    while(scanner.hasNextInt()){
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if(a == 0 && b == 0){
        break;
      }
      n.add(a);
      m.add(b);
    }
    for(int i = 0; i < n.size(); i++){
          System.out.print("\n");
      for(int j = 0; j < n.get(i); j++){
          System.out.print("\n");
        for(int k = 0; k < m.get(i); k++){
          System.out.print("#");
        }
      }
    }
  }

}