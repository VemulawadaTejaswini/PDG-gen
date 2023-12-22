import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		
		InputStream input = System.in;
		Scanner in = new Scanner(input);
		int[] allInt = new int[5];
		for(int i = 0;i<5;i++) {
			allInt[i] = Integer.parseInt(in.next());
		}
		int[] total = new int[5];
		
		for(int i = 0;i<5;i++) {
			total[i] = 0;
			for(int j = 0;j<5;j++) {
				
				if(i == j) {
					total[i] += allInt[j];
				}else {
					total[i] += allInt[j]/10*10;
					int tmp = allInt[j]%10 == 0 ? 0 : 10;
					total[i] += tmp;
				}
				
			}
			
		}
		Arrays.sort(total);
		
		System.out.println(total[0]);
		
		
	}
}
	
	