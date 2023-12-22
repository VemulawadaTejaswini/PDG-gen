import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		if (b>a){
			c = a;
			a = b;
			b = c;
		}
		
		boolean af=false;
		boolean bf=false;
		for (int i=0; i<16; i++){
			if ((a>0) && !af){
				a--;
				af = true;
				bf = false;
			}
			if ((b>0) && !bf){
				b--;
				af = false;
				bf = true;
			}
			if ((af && !bf) || (!af && bf)){
				i++;
				af = false;
				bf = false;
			}
		}
		
		
		if ((a==0) && (b==0)){
			System.out.println("Yay!");
		}
		else {
			System.out.println(":(");
		}
			
			
			
			
			
	}

}
