import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int[] numbers = new int[n];
	  int counter = 0;

	  for(int i = 0; i < n; i++) {
		  numbers[i] = sc.nextInt();
	  }
	  while(true) {
		  boolean isKisuu = false;
		  for(int j = 0; j < n; j++) {
			  if (numbers[j] % 2 == 1) {
				  isKisuu = true;
				  break;
			  } else {
				  numbers[j] /= 2;
				  counter = counter + 1;
			  }
		  }

		 if (isKisuu) {
			 break;
		 }


	  }

	  System.out.println(counter / n);
  }
}