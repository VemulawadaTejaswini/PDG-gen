import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int xp = sc.nextInt();
			int ybp = sc.nextInt();
			int yo = sc.nextInt();
			int ytp = sc.nextInt();
			int wp = sc.nextInt();
			int min = xp * wp;
			int sum = 0;
			if(wp > yo){
				sum = (wp - yo) * ytp + ybp; 
			}
			if(sum < min){
				System.out.println(sum);
			}else{
				System.out.println(min);
			}
		}	
	}		