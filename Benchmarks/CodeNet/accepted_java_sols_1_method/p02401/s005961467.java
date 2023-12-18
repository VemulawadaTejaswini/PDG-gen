import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean value = true;
    List<Integer> list = new ArrayList<Integer>();

    while(value){
      int a = Integer.parseInt(sc.next());
      String s = sc.next();
      int b = Integer.parseInt(sc.next());

      switch(s){
        case("+"):
          list.add(a+b);
          break;
        case("-"):
          list.add(a-b);
          break;
        case("*"):
          list.add(a*b);
          break;
        case("/"):
          list.add(a/b);
          break;
        default:
          value = false;
          break;
      }
    }

    for(int i=0; i<list.size(); i++)
    {
      System.out.println(list.get(i));
    }
  }
}
