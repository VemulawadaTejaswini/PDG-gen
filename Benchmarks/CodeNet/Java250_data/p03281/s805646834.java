import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

	  int N = sc.nextInt();


	  int test = 1;
	  int total = 0;
	  while (test <= N) {
		  int count = 0;
		  for (int i = 1; i <= test ; i++) {
			  if(test % i == 0) {
				  count++;
			  }
			  if (count > 8) {
				  break;
			  }
		  }
		  if (count == 8) {
			  total++;
		  }
		  test = test + 2;
	  }
	  System.out.println(total);


  }
}
