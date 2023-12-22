import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int numAss= sc.nextInt();
		for(int i = 0 ; i <numAss ;i++) {
			int durationA = sc.nextInt();
			days-=durationA;
		}
		if(days <0) {
			System.out.println("-1");
		}else {
			System.out.println(days);
		}
	}

}