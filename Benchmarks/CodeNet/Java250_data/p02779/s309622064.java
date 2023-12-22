import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n =  sc.nextInt();
	List<String> a = new ArrayList<String>();

	for(int i=0;i<n;i++) {
		a.add(sc.next());
	}

	List<String> b = new ArrayList<String>(new HashSet<>(a));

	int la = a.size();
	int lb = b.size();
	System.out.println(la==lb?"YES":"NO");
  }
}