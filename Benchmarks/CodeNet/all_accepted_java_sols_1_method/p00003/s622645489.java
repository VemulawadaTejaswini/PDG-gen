import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.nextLine();
		int[][] a = new int[N][3];
		String str ;
		String[] result;
		
	
		for(int i = 0;i <N;i++)
		{
			result = s.nextLine().split(" ");
			for(int j = 0; j < a[i].length;j++)
			{
				a[i][j] = Integer.parseInt(result[j]);
			}
			Arrays.sort(a[i]);
		}
		
		for(int i = 0;i<N;i++)
		{
			if(a[i][1]*a[i][1]+a[i][0]*a[i][0]-a[i][2]*a[i][2]==0)
			{
				str = "YES";
			}else{
				str = "NO";
			}
			System.out.println(str);

		}
	}
}