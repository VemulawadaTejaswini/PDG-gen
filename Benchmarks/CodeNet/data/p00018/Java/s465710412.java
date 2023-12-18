
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int[] ans = new int[5];

		for(int i=0; i<5;i++)ans[i] = sc.nextInt();
			Arrays.sort(ans); 
			for(int j=4; j>=0; j--) {
				if(j !=0) { //jが0でないならば
					System.out.print(ans[j]+" "); 
				}else {
					System.out.println(ans[j]);
				}
			}
	}
}

