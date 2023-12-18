import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int inputN =  sc .nextInt();
	int money = 0;

	while(true){
		money += 1000;
		if(inputN <= money) {
			break;
		}
	}
	System.out.println(money - inputN);
}
}