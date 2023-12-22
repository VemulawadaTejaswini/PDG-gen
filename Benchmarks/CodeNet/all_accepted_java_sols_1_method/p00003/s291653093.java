import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int temp[]=new int[3];
		for(int i = 0;i < n; i++){
			for(int j = 0;j < 3; j++)	temp[j]=sc.nextInt();
			Arrays.sort(temp);
			
		
			if(temp[0]*temp[0]+temp[1]*temp[1]==temp[2]*temp[2])System.out.println("YES");
			else System.out.println("NO");

		}
	}
}