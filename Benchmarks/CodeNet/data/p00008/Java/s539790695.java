import java.util.Scanner;
import java.math.*;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextInt()){
			int n = input.nextInt();
			int ans = 0;
			for(int a=0; a<10; a++)
				for(int b=0; b<10; b++)
					for(int c=0; c<10; c++)
						for(int d=0; d<10; d++)
							if(a+b+c+d==n) ans++;
			System.out.println(ans);
		}
	}

}