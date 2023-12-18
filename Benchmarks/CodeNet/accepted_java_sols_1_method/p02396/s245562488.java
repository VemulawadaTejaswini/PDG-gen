import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  ArrayList<Integer> list = new ArrayList<>();
	  while (true) {
		  int i = sc.nextInt();
		  if (i == 0) { break; }
		  list.add(i);
	  }
	  for (int i = 0; i < list.size(); i++) {
		  System.out.println("Case " + (i + 1) + ": " + list.get(i));
	  }
  }
}
