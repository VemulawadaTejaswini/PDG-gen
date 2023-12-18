import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		
		String[] nk =  scanner.nextLine().split(" ");
		int[] ar = new int[Integer.parseInt(nk[0])];
		
		for(int i = 0; i < Integer.parseInt(nk[0]) ; i++) {
			ar[i] = scanner.nextInt();
		}
		
//		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		
		
//		System.out.println(Arrays.toString(ar));
		
		int sum=0;
		for(int i = 0; i < Integer.parseInt(nk[1]); i++) {
			sum+= ar[i];
		}
		
		
		System.out.println(sum);
		

	}	}