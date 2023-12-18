import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num =new int[3];
		for(int i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
		}
		
		int count = 0;
		while(num[0]!=num[1]||num[1]!=num[2] || num[0] != num[2]) {
			Arrays.sort(num);
			if(num[0] != num[2] && num[1] != num[2]) {
				num[0]++;
				num[1]++;
				count++;
			}
			if(num[0] != num[2]&&num[1] == num[2]) {
				num[0]+=2;
				count++;
			}
		}
		System.out.println(count);
	}
}