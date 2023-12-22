import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] data = new int[5];
		int max = 0;
		int sum = 0;

		for (int i = 0;i<5 ;i++ ) {
			data[i] = sc.nextInt();
			if (data[i]%10>0) {
				max = Math.max(max,10-data[i]%10);
			}
		}
		for (int i = 0;i<5 ;i++ ) {
			if (10-data[i]%10==max) {
				sum+=data[i];
				data[i] = 0;
				break;
			}
		}

		for (int i = 0;i<5 ;i++ ) {
		 if (data[i]%10==0) {
				sum+=data[i];
			}else{
				sum +=data[i]+10-data[i]%10;
			}
		}

		System.out.println(sum);


	}
}
