import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = sc.nextInt();
			if(a == 0 && b == 0 && d == 0)break;
			else calc(a,b,d);
			
		}
	}
	public void calc(int a, int b, int d){
		int minX = -1;
		int minY = -1;
		
		int sum = 0;
		while(minX == -1){
			for(int i = 0; i <= sum; i++){
				int j = sum - i;
				if(Math.abs(i*a-j*b) == d || i*a+j*b == d){
					if(minX == -1 || i*a+j*b < minX*a+minY*b){
						minX = i;
						minY = j;
					}
				}
			}
			sum++;
		}
		
		System.out.println(minX + " " + minY);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}