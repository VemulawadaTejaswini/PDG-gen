import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    List<String> list = new ArrayList<String>();

    list.add("Sunny");
    list.add("Cloudy");
    list.add("Rainy");

    int index = list.indexOf(sc.next());
    System.out.println(list.get( index + 1 >= list.size() ? 0 : index + 1 ));
  }
}
