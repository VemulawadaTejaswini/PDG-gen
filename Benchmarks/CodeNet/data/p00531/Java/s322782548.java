import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int xp = sc.nextInt();// price per 1L 
			int ybp = sc.nextInt();// basic price of Y 
			int yo = sc.nextInt(); // overlimit of Y 
			int ytp = sc.nextInt();// tukika of Y per 1 L 
			int wp = sc.nextInt();//water p
			int min = xp * wp;
			int sum = ybp;
			if(wp > yo){
				sum = (wp - yo) * ytp + ybp; 
			}
			if(sum < min){
				System.out.println(sum);
			}else{
				System.out.println(min);
			}
			sc.close();
		}	
	}		