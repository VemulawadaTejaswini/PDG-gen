import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		char [][] c = new char[h+2][w+2];
		
		for(int i = 1; i <= h ;i++) {
			String s = sc.next();
			for(int j = 1; j <= w ; j++) {
				c[i][j] = s.charAt(j-1);
 			}	
		}
		int temp = -1;
		
		for(int i = 1; i <= h ;i++) {
			for(int j = 1; j <= w ; j++) {
				boolean x = true;
				x = (c[i][j] == '#'); 
				
				boolean y = true;
				y = (c[i-1][j] != '#'&& c[i][j-1] != '#'&& c[i+1][j] != '#'&& c[i][j+1] != '#');
				

				if(x && y) {
					temp = 0;
					break;
				}
			}
 		}
		
		if(temp == 0)
		System.out.println("No");
		if(temp == -1)
		System.out.println("Yes");
		
		}
}
