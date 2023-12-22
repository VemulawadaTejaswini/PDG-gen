import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int pr = 0;
			for(int i=0;i<n;i++){
				int lng = stdIn.nextInt();
				lng += stdIn.nextInt();
				lng += stdIn.nextInt();
				int w = stdIn.nextInt();
				if(lng>160||w>25){
					continue;
				}
				else if(lng>140||w>20){
					pr+=1600;
				}
				else if(lng>120||w>15){
					pr+=1400;
				}
				else if(lng>100||w>10){
					pr+=1200;
				}
				else if(lng>80||w>5){
					pr+=1000;
				}
				else if(lng>60||w>2){
					pr+=800;
				}
				else{
					pr+=600;
				}
			}
			System.out.println(pr);
		}
	}
}