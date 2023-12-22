import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int intA = sc.nextInt();
		int intB = sc.nextInt();
		int intC = sc.nextInt();
		int intKosuu = 0;

		for(int i = intA; i <= intB; i++){

			if(intC % i == 0){
				intKosuu++;
			}
		}

		System.out.println(intKosuu);
	}
}