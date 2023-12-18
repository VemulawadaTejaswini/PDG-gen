import java.util.Scanner;


public class Main {
	 public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			double input1 = sc.nextDouble();
			double input2 = sc.nextDouble();
			if(input1 == input2) System.out.println("EQUAL");
			if(input1 > input2)System.out.println("GREATER");
			if(input1 < input2)System.out.println("LESS");
		  }

}
