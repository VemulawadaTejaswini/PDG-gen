import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, temp, i;
    number = Integer.parseInt(sc.next());
    int[] num = new int[number];
    for(i = 0; i < number; i++) num[i] = Integer.parseInt(sc.next());
    temp = 0;
    for(i = 0; i < number; i++) temp ^= num[i];
    if(temp == 0) System.out.println("Yes");
    else System.out.println("No");
  }
}
