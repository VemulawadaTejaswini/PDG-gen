import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dataset = scanner.nextInt();
		for(int i=0; i<dataset; i++){
			double xa = scanner.nextDouble();
			double ya = scanner.nextDouble();
			double ra = scanner.nextDouble();
			double xb = scanner.nextDouble();
			double yb = scanner.nextDouble();
			double rb = scanner.nextDouble();
			
			double dist = Math.sqrt(Math.pow(xa-xb, 2) + Math.pow(ya-yb, 2));
			double bigr = (ra >= rb) ? ra : rb;
			double smallr = (ra >= rb) ? rb : ra;
			
			if( dist > (ra + rb) ){
				System.out.println("0");
			}else{
				if(dist < (bigr - smallr)){
					if(ra>rb){
						System.out.println("2");
					}else{
						System.out.println("-2");
					}
				}else{
					System.out.println("1");
				}
			}
			

		}
		
	}
}