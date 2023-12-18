import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    List<Integer> answer = new ArrayList<Integer>();
    boolean end = false;
    while(!end) {
      int a = scanner.nextInt();
      String op = scanner.next();
      int b = scanner.nextInt();

      switch(op) {
        case "+": answer.add(a+b);
          break;
        case "-": answer.add(a-b);
          break;
        case "*": answer.add(a*b);
          break;
        case "/": answer.add(a/b);
          break;
        case "?": end = true;
          break;
       }
    }

    for(int i = 0; i < answer.size(); ++i) {
      System.out.println(answer.get(i));
    }
   }
} 
