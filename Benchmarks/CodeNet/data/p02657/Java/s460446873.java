import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
    int b = (int)(sc.nextDouble() * 100.00); 
  	long c = a * b / 100L;
    System.out.println(c);
  }
}