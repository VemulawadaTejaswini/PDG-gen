import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
	  
	  Scanner scanner = new Scanner(System.in);
	  int amount = scanner.nextInt();
	  List<Integer> takoyakiList = new ArrayList<>();
	  for (int i = 0; i < amount; i++) {
		int takoyaki = scanner.nextInt();
		takoyakiList.add(takoyaki);
	}
	  scanner.close();
	  int total = 0;
	  for (int i = 0; i < amount; i++) {
		for (int j = i + 1; j < amount ; j++) {
			total += takoyakiList.get(i) * takoyakiList.get(j);
		}
	}
	  System.out.println(total);
   }
}
