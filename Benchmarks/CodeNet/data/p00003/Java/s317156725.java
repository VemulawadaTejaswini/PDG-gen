import java.util.Arrays;
import java.util.Scanner;



public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.nextLine());
		int[] values = new int[3];

		for(int j=0;j<i;j++)
		{
			String[] s = sc.nextLine().split("[\\s]+");
			values[0] = Integer.parseInt(s[0]);
			values[1] = Integer.parseInt(s[1]);
			values[2] = Integer.parseInt(s[3]);

			Arrays.sort(values);
			if(values[0]*values[0] + values[1]*values[1] == values[2]*values[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}