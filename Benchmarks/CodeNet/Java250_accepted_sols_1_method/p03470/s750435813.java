import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//  B Kagami Mochi

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    List<Integer> list = new ArrayList();

    for(int i = 0; i < N ; i++) {
    	list.add(Integer.parseInt(sc.next()));
    }

    Collections.sort(list);
    Collections.reverse(list);

    int layer = 0;
    int l2 = 0;

    for(Integer l : list) {
    	if(l != l2) {
    		layer++;
    	}
    	l2 = l;
    }

    System.out.println(layer);
  }
}