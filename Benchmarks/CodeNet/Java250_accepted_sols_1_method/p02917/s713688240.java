import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
          int num = scan.nextInt();
          int Bsum = 0;
          List<Integer> array = new ArrayList<>();
			List<Integer> Carray = new ArrayList<>();
          
          for (int i = 0; i < num-1; i++) {
				int a = scan.nextInt();
				array.add(a);
			}
          
          Bsum = array.get(0) + array.get(array.size()-1);
          
          if(array.size() > 1) {
            for (int i = 1; i < array.size(); i++) {
              if(array.get(i-1) < array.get(i)) {
                Bsum+=array.get(i-1);
              } else {
                Bsum+=array.get(i);
              }
            }
          }
          
          
          System.out.println(Bsum);
        }
    }
}