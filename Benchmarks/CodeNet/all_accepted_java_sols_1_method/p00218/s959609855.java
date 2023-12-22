import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n == 0)break;
			for(int i = 0;i < n;i++){
				int pm = in.nextInt();
				int pe = in.nextInt();
				int pi = in.nextInt();
				if(pm == 100 ||pe == 100||pi == 100){
					System.out.println("A");
				}else if(pm + pe >= 180){
					System.out.println("A");
				}else if(pm + pe + pi >= 240){
					System.out.println("A");
				}else if(pm + pe + pi >= 210){
					System.out.println("B");
				}else if(pm + pe + pi >= 150 && (pm >= 80 || pe >= 80)){
					System.out.println("B");
				}else {
					System.out.println("C");
				}
			}
		}
	}
}