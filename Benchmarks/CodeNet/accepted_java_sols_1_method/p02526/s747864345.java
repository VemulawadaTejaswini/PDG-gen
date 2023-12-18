import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
public static void main(String[] args) {
  Set<Integer> s = new HashSet<Integer>();
  Set<Integer> t = new HashSet<Integer>();
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  for (int i = 0; i < n; i++) {
	s.add(in.nextInt());
  }
  int q = in.nextInt();
  for (int i = 0; i < q; i++) {
	t.add(in.nextInt());
  }
  Set<Integer> ansSet = new HashSet<Integer>(s);
  ansSet.retainAll(t);
  System.out.println(ansSet.size());
}
}