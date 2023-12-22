import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int a = s.nextInt();
	int b = s.nextInt();

	int costTrain = n * a;
	int costTaxi = b ;

	if(costTrain<=costTaxi){
		System.out.println(costTrain);
	}else
	{
		System.out.println(costTaxi);
	}

}
}
