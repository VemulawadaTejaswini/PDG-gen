import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
    List<Integer> numList = new ArrayList<>();
    while(sc.hasNextInt()){
        numList.add(sc.nextInt());
    }
    int total = numList.stream().reduce(0,(s1,s2) -> s1 + s2);
    double result = Math.ceil(total / 2.0);
    System.out.println((int)result);
  }
}