import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> H = new ArrayList<>();
    ArrayList<Integer> W = new ArrayList<>();
    while (true) {
    	int h = sc.nextInt(); int w = sc.nextInt();
    	if (h == 0 && w == 0) { break; }
    	H.add(h); W.add(w);
    }
    for (int k = 0; k < H.size(); k++) {
	  	for (int i = 0; i < H.get(k); i++) {
	  		for (int j = 0; j < W.get(k); j++) {
				System.out.print("#");
			}
			System.out.print("\n");
	  	}
	  	System.out.print("\n");
    }
  }
}
