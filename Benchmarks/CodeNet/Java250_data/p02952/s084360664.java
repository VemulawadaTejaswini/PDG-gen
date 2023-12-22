import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
	
	if(a < 10)
		System.out.println(a);
	else if(a < 100)
		System.out.println(9);
	else if(a < 1000)
		System.out.println(a - 90);
	else if(a < 10000)
		System.out.println(909);
	else if(a < 100000)
		System.out.println(a - 9090);
	else
		System.out.println(90909);
	
  }
	
}