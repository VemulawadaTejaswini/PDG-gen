import java.io.*;
import java.util.*;
public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.nextLine();
		//int count = sc.nextInt();
		//int nums[] = new int[count];
		/*int size = nums.length / 2;
		for(int i = 0; i < nums.length; i++) {
		}*/
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = 0;
		if(num2 < 10) num3 = num1*10 + num2;
		else if(num2 < 100) num3 = num1*100 + num2;
		else num3 = num1*1000 + num2;
		boolean flag = false;
		for(int i = 0; i < 316; i++) {
			if(num3 == i*i) { System.out.println("Yes"); flag = true;}
		}
		if(!flag) System.out.println("No");
	}
}