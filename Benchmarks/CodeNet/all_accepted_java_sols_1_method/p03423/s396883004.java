import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = -1;
      while(n >= 0){
      	n = n - 3;
        count++;
      }
      System.out.println(count);
      sc.close();
    }
}
