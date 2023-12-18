import java.util.*;
 
public class Main {
  public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
    Integer b = sc.nextInt();
    Integer dist = b-a;
    Integer num = 0;
    for (int i = 1; i < b-a; i++) {
      num += i;
    }
    System.out.println(num-a);
  }
}  