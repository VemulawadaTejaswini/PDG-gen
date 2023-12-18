import java.util.Scanner;

//https://procon-questions.s3.us-east-2.amazonaws.com/final/C_vietnam.html
public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (true) {
	  int b = sc.nextInt();
	  if (b == 0) {
		break;
	  }
	  calculatorResult(b);
	}
  }

  public static void calculatorResult(int b) {
	int i = 1;
	int lowestFloor = 1;
	int numberOfFloors = 0;
	int sum = 0;
	while (true) {
	  if (sum == b) {
		break;
	  }
	  if (sum < b) {
		sum += i;
		numberOfFloors++;
		i++;
	  }
	  if (sum > b) {
		sum -= lowestFloor;
		lowestFloor++;
		numberOfFloors--;
	  }
	}
	System.out.println(lowestFloor + " " + numberOfFloors);
  }
}

