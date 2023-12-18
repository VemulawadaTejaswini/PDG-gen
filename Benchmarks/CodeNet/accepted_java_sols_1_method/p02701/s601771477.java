import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int Sum=0;
    List<String> listA = new ArrayList<String>();
    for (int i=0;i<N ;i++ ) {
      listA.add(sc.next());

    }
    List<String> listB = listA.stream().distinct().collect(Collectors.toList());


    System.out.println(listB.size());




  }
}
