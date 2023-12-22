import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] count = new int[9];
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(1<=a&&a<400) count[0]++;
			else if(400<=a&&a<800) count[1]++;
			else if(800<=a&&a<1200) count[2]++;
			else if(1200<=a&&a<1600) count[3]++;
			else if(1600<=a&&a<2000) count[4]++;
			else if(2000<=a&&a<2400) count[5]++;
			else if(2400<=a&&a<2800) count[6]++;
			else if(2800<=a&&a<3200) count[7]++;
			else if(3200<=a) count[8]++;
		}
		int min = 0;
		int max = 0;
		for(int i = 0; i < 8; i++) {
			if(count[i]!=0) {
				min++;
				max++;
			}
		}
		max+=count[8];
		if(min==0) {
			min++;
		}
		System.out.println(min+" "+max);
	}
}