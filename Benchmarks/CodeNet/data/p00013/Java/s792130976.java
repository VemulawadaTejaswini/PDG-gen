import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> l = new ArrayList<Integer>();
    while(sc.hasNext()) {
      Integer i = sc.nextInt();
      if(i == 0) {
        System.out.println(l.get(l.size()-1)); 
	l.remove(l.size()-1);
      }
      else {
        l.add(i);
      }
    } 
  }
}