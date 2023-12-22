import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int temp; 	//入れ替え用

		if(num2 > num1){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num3 > num2){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num2 > num1){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		temp = Integer.parseInt("" + num1 + num2);
		
		System.out.println(temp + num3);
	}
}