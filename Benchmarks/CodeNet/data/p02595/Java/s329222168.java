import java.util.Scanner;
public class Distance{	
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int no_input = sc.nextInt();
			int max_distance = sc.nextInt();
			int cnt = 0;
			for(int i=0; i<no_input; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				double z = Math.sqrt((x*x)+(y*y));
				if(z<=max_distance)
					cnt++;
			}
			System.out.println(cnt);
		}
}