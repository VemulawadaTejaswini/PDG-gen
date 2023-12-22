import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      while(n > 0){
        n -= 1000;
      }
		System.out.println(Math.abs(n));
	}
}