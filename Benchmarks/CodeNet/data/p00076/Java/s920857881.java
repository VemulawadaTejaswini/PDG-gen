import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//double x = 1;
		//double y = 0;
		while(n != -1){
			double rad = 0;
			double hyp = 1;
			for(int i = 1; i < n; i++){
				rad += Math.atan(1 / hyp);
				hyp = Math.sqrt(hyp*hyp + 1);
				//x = hyp * Math.cos(rad);
				//y = hyp * Math.sin(rad);
			}
			System.out.println(hyp * Math.cos(rad));
			System.out.println(hyp * Math.sin(rad));
			n = sc.nextInt();
		}
	}
}