import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, number, count = 0;
    number = Integer.parseInt(sc.next());
    int[] num_array = new int[number];
    for(i = 0; i < number; i++) num_array[i] = Integer.parseInt(sc.next());
    for(i = 0; i < number; i++) {
      if(i + 1 != num_array[i]) count++;
    }
    if(count == 0 || count == 2) System.out.println("YES");
    else System.out.println("NO");
  }
}
