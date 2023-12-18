import java.util.Scanner;
public class Main {
  
  public static final long max = (long)Math.pow(10,18);
  
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int count = Integer.parseInt(sc.next());
      	long result = 1;
        for (int i=0;i<count; i++) {
          long next = Long.parseLong(sc.next());
          result = result * next;
          if (result > max) {
            System.out.println("-1");
            return;            
          }
        }
        System.out.println(String.valueOf(result));
    }
}