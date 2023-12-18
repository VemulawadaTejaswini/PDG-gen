import java.util.*;

public class Main {
	
  	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
      	String input = sc.nextLine();
      	int count = Integer.valueOf(input);
      	boolean[] found = new boolean[101];
      	int total = 0 ;
        for( int i = 0; i<count ;i++) {
          int value = Integer.valueOf(sc.nextLine());
          if(found[value]==false) {
          	found[value] = true;
            total++;
          }
        }
      	System.out.println(total);
    }
}