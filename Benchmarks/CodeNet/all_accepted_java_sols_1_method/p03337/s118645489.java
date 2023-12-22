import java.util.*;
import static java.lang.System.*;
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(in);
    int A = sc.nextInt(), B = sc.nextInt();
    int[] array = {A+B,A-B,A*B};
    Arrays.sort(array);
    out.println(array[2]);
  }
}