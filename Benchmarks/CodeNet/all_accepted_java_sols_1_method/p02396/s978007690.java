import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    int i=1;

    while (true){
      int x = sc.nextInt();
      if (x==0) break;
      System.out.println("Case "+i+": "+x);
      i++;
    }
  }
}
