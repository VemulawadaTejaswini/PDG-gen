import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
	{
     	Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			int ans = in.nextInt();
			int sum = 0;
			int cnt = 0;
			
			for (int a = 0; a < 10; a++) {
				for (int b = 0; b < 10; b++) {
					for (int c = 0; c < 10; c++){
						for (int d = 0; d < 10; d++) {
							sum = a + b + c + d;
							if (sum == ans) {
								cnt++;
							}
						}
					}
				}
			}
			
			System.out.println(cnt);
		}		
	}
}