import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = (long)(sc.nextDouble() * 100 + 0.01);
      long ans = a * b;
      System.out.print(ans / 100);
    }
}
