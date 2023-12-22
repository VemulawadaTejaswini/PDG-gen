import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  ArrayList<Integer> list = new ArrayList<>();
	  while (true) {
		  String s = sc.nextLine();
		  String[] ss = s.split(" ");
		  int a = Integer.parseInt(ss[0]);
		  int b = Integer.parseInt(ss[1]);
		  if (a == 0 && b == 0) { break; }
		  list.add(a);
		  list.add(b);
	  }
	  for (int i = 0; i < list.size(); i += 2) {
		  int c = list.get(i);
		  int d = list.get(i + 1);
		  if (c > d) {
			  System.out.println(d + " " + c);
		  } else {
			  System.out.println(c + " " + d);
		  }
	  }
  }
}
