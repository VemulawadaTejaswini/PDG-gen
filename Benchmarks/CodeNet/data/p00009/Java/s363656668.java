import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		int count = 0;
		if( n >= 2 )
			count++;
		if( n >= 3 )
			count++;

		int[] p = new int[n];
		p[0] = 2;
		p[1] = 3;
		for(int i = 5; i <= n; i += 2){
			for(int j =1; j < count; j ++){
				if( i % p[j] == 0 ){
					break;
				}
				else if ( j == count - 1 ){
					p[count] = i;
					count++;
				}
			}
		}

		System.out.println(count);
	}
}