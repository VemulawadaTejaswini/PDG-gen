import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int min = sc.nextInt();
    int max = sc.nextInt();
        
    int count = 0;
        
    for(int i=min; i<=max; i++) {
        String val = String.valueOf(i);
        String reverseVal = (new StringBuilder(val)).reverse().toString();

        if(val.equals(reverseVal)) {
        	count++;
    	}
    }
    System.out.println(count);
  }
}