import java.io.IOException;
import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int sell = scanner.nextInt();
      int buy = scanner.nextInt();
      scanner.nextLine();
      ArrayList<Integer> list = new ArrayList<>();
      while(scanner.hasNextInt()){
      		list.add(scanner.nextInt());
      }
      Collections.sort(list);
      int result = 0;
      for(int i = 0; i < buy; i++){
      	result += list.get(i);
      }
      System.out.println(result);
    }
}