import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int A = sc.nextInt();
      int B = sc.nextInt();
      double T = sc.nextInt();
      int time = 0 + A;
      int output = 0;
      while((T + 0.5) >= time){
        output += B;
        time += A;
      }
      System.out.println(output);
	}
}
