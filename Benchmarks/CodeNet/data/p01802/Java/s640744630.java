import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int d = sc.nextInt();
			int e = sc.nextInt();
			if(d==0 && e==0) break;
			double min = Double.MAX_VALUE;
			for(int i=0;i<d;i++) min = Math.min(min, Math.abs(e-Math.sqrt(i*i+(d-i)*(d-i))));
			System.out.println(min);
		}
	}
}