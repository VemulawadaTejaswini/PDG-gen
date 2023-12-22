
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String str1 = sc.nextLine();
    String[] vals1 = str1.split(" ");

    int n = Integer.parseInt(vals1[0]);
    int m = Integer.parseInt(vals1[1]);

    String str2 = sc.nextLine();
    List<Integer> votes = Arrays.asList(str2.split(" ")).stream().map(Integer::valueOf).collect(Collectors.toList());
    
    Collections.sort(votes, Collections.reverseOrder());

    int sum = votes.stream().mapToInt(i -> Integer.valueOf(i)).sum();
    int minVal = votes.get(m - 1);

    boolean res = minVal < (double) sum / ((double) (4 * m));

    if (res) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }

  }
}